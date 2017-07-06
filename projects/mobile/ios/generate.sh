#Generating IPA
executeXcodeIpaBuild(){

cd  Bacardi_10024

/bin/sh -c "sleep 10 ; echo IOS_Platform_Removed"

echo 3NCQCqv4 | sudo -S ionic state reset

/bin/sh -c "sleep 10 ; echo installing NPM "

echo 3NCQCqv4 | sudo  npm install

/bin/sh -c "sleep 10 ; echo Building Ionic"

echo 3NCQCqv4 | sudo ionic build

/bin/sh -c "sleep 10 ; echo Permission_to_be_Changed"

cd platforms

echo 3NCQCqv4 | sudo -S chmod -R 777 ios

/bin/sh -c "sleep 10 ; echo Permission_changed"

pwd

cp -R /Users/administrator/ionic_ios_blank_project/platforms/ios/config  ios/

pwd

/bin/sh -c "sleep 10 ; echo Config_folder_copy"

cd  ios

/bin/sh -c "sleep 10 ; echo open_Xcode"

open  Bacardi_10024.xcodeproj

/bin/sh -c "sleep 10 ; echo Xcode_is_ready"

pwd

echo 3NCQCqv4 | sudo -S chmod -R 777 ~/Desktop/Bacardi_10024/Bacardi_10024

/bin/sh -c "sleep 10 ; echo Bacardi_10024_Access_Granted"

security -v unlock-keychain -p "3NCQCqv4" "login.keychain"

xcodebuild clean -project Bacardi_10024.xcodeproj -configuration Release -alltargets

xcodebuild archive -project Bacardi_10024.xcodeproj -scheme Bacardi_10024 -destination generic/platform=iOS  -archivePath "build/"Bacardi_10024.xcarchive

xcodebuild -exportArchive -archivePath "build/"Bacardi_10024.xcarchive -exportPath "build/"Bacardi_10024 -exportFormat ipa -exportProvisioningProfile "XC Ad Hoc: *"

pwd

/bin/sh -c "sleep 10 ; echo IPA_Generated_Using_Xcode"

cd ~/Desktop/Bacardi_10024/Bacardi_10024/platforms/ios/build

curl -H "X-InstallrAppToken:qmIThc6ecTx6W19hrZhlDg7bggam4jBb"  https://www.installrapp.com/apps.json -F qqfile=@Bacardi_10024.ipa --verbose >IpaUploadSucess.json

cd ~/Desktop/Bacardi_10024/

#cp -R ~/AutoProvision.jar ~/Desktop/Bacardi_10024/

#java -jar AutoProvision.jar

exit 0
}

executeXcodeIpaBuildTablet(){

#this cd refer inside the project dir in mac mini desktop

cd  Bacardi_10024

/bin/sh -c "sleep 10 ; echo IOS_Platform_Removed"

echo 3NCQCqv4 | sudo -S ionic state reset

/bin/sh -c "sleep 10 ; echo installing NPM "

echo 3NCQCqv4 | sudo  npm install

/bin/sh -c "sleep 10 ; echo Building Ionic"

echo 3NCQCqv4 | sudo ionic build

/bin/sh -c "sleep 10 ; echo Permission_to_be_Changed"

cd platforms

echo 3NCQCqv4 | sudo -S chmod -R 777 ios

/bin/sh -c "sleep 10 ; echo Permission_changed"

pwd

cp -R /Users/administrator/ionic_ios_blank_project/platforms/ios/config  ios/

pwd

/bin/sh -c "sleep 10 ; echo Config_folder_copy"

cd  ios

/bin/sh -c "sleep 10 ; echo open_Xcode"

open  Bacardi_10024_tablet.xcodeproj

/bin/sh -c "sleep 10 ; echo Xcode_is_ready"

pwd

echo 3NCQCqv4 | sudo -S chmod -R 777 ~/Desktop/Bacardi_10024_tablet/Bacardi_10024

/bin/sh -c "sleep 10 ; echo Bacardi_10024_tablet_Access_Granted"

security -v unlock-keychain -p "3NCQCqv4" "login.keychain"

xcodebuild clean -project Bacardi_10024_tablet.xcodeproj -configuration Release -alltargets

xcodebuild archive -project Bacardi_10024_tablet.xcodeproj -scheme Bacardi_10024_tablet -destination generic/platform=iOS  -archivePath "build/"Bacardi_10024_tablet.xcarchive

xcodebuild -exportArchive -archivePath "build/"Bacardi_10024_tablet.xcarchive -exportPath "build/"Bacardi_10024_tablet -exportFormat ipa -exportProvisioningProfile "XC Ad Hoc: *"

pwd

/bin/sh -c "sleep 10 ; echo IPA_Generated_Using_Xcode"

cd ~/Desktop/Bacardi_10024_tablet/Bacardi_10024/platforms/ios/build

curl -H "X-InstallrAppToken:qmIThc6ecTx6W19hrZhlDg7bggam4jBb"  https://www.installrapp.com/apps.json -F qqfile=@Bacardi_10024_tablet.ipa --verbose >IpaUploadSucess.json

cd ~/Desktop/Bacardi_10024_tablet/

#cp -R ~/AutoProvision.jar ~/Desktop/Bacardi_10024_tablet/

#java -jar AutoProvision.jar

exit 0
}
# call arguments verbatim:
$@