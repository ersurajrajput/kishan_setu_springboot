#!/bin/bash

# === CONFIG ===
VM_USER="kishan_setu"
VM_IP="4.247.159.148"
VM_APP_NAME="kishan_app.jar"   # name to store jar on server
LOCAL_JAR_PATH="target/*.jar"  # your jar location

echo "=== Building JAR ==="
mvn clean package -DskipTests || { echo "Maven build failed"; exit 1; }

echo "=== Uploading JAR to Server ==="
scp $LOCAL_JAR_PATH $VM_USER@$VM_IP:/home/$VM_USER/$VM_APP_NAME || { echo "Upload failed"; exit 1; }

echo "=== Restarting App on Server ==="
ssh $VM_USER@$VM_IP << 'EOF'

# Kill old Spring Boot process
PID=\$(pgrep -f "$VM_APP_NAME")
if [ ! -z "\$PID" ]; then
  echo "Killing old process: \$PID"
  kill -9 \$PID
fi

# Start new one
echo "Starting new app..."
nohup java -jar /home/$VM_USER/$VM_APP_NAME > spring.log 2>&1 &

echo "App restarted successfully!"

EOF

echo "=== Deployment Complete! ==="
