export PATH=$PATH:/Users/administrator/gradle-2.11/bin
echo 'Gradle Path set..!'
echo 3NCQCqv4 | sudo -S chmod -R 777 ~/Desktop/Bacardi_10024/
cd ~/Desktop/Bacardi_10024/
pwd
echo 'Started to excute gradle script'
gradle -q deployIPA > gradlelog.txt 2>&1