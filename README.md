# Cordova-Plugin-Modern-Browser (Android)

## Screenshots
<img src="https://github.com/hitmacreed/Cordova-Plugin-Modern-Browser/blob/master/art/screenshots.png?raw=true" width="888">

<img src="https://github.com/hitmacreed/Cordova-Plugin-Modern-Browser/blob/master/art/first.png?raw=true" width="888">

## Installation

```sh
 cordova plugin add https://github.com/hitmacreed/Cordova-Plugin-Modern-Browser.git 
```

```sh
 ionic cordova plugin add https://github.com/hitmacreed/Cordova-Plugin-Modern-Browser.git
```


## Info
An Android Cordova plugin that allows users to use a modern In App Webbrowser without leaving the app.

## BEFORE RUN 
Add to your platform/android/app/buid.gradle
```sh
  allprojects {
      repositories {
          ...
          maven { url "https://jitpack.io" }
      }
  }
```
 
## Usage

 Declare in your component
```javascript
 declare var ModernBrowserPlugin: any;
```

 Usage 
```javascript
const options = {
      url : 'https://splitting.js.org/', //URL
      statusBarColor : '#00004d', //STATUS BAR COLOR
      toolbarColor : '#ffffff', //TOOLBAR COLOR
      iconDefaultColor : '#000000', //ICONS DEFAUT COLORS
      iconDisabledColor : '#A9A9A9', //DISABLE ICONS COLOR
      iconPressedColor : '#A9A9A9', //PRESSED ICON COLORS
      webViewCameraEnabled : true, // ENALBE CAMERA ACCESS
      showIconBack : true, //SHOW ICONS BACK
      disableIconBack : false, //DISABLE ICON BACK
      showIconForward : true, //SHOW FORWARD ICON
      disableIconForward : false, //DISABLE FORWARD ICON
      showIconMenu : true, //SHOW MENU ICON
      disableIconMenu : false, //DISABLE ICON MENU
      fileChooserEnabled : true, //SHOW FILE CHOSSER
      showProgressBar: true, //SHOW PROGESS BAR
      progressBarColor: '#00004d', //PROGRESS BAR COLOR
      showUrl: true, //SHOW URL TITLE
      titleColor: '#000000', //URL TITLE COLOR
      menuColor: '#ffffff', //MENU OPTIONS COLOR
      webViewAppCacheEnabled : false, //BROWSER CACHE 
      webViewGeolocationEnabled: true, //GEOLOCALTION
      webViewAudioEnabled: true, //ENABLE AUDIO ACCESS
      webViewCookieEnabled: true //ENABLE COOKIES
    };

    ModernBrowserPlugin.create(options, function(loaded) {
      console.log(loaded);
      // DO SOMETHING AFTER URL LOAD
      }, function(err) {
      console.log(err);
    });
 
```

## KNOW ISSUE 
#### error: duplicate value for resource 'attr/layout_anchorGravity' with config ''. 
Solution
```sh
implementation 'com.android.support:support-v4:28.0.0' 
```

##### Libraries used to make this plugin
```sh
https://github.com/TheFinestArtist/FinestWebView-Android
https://github.com/hzw1199/AwesomeWebView-Android
```

## Designer

#### [Min Kim](https://github.com/openyourboxes)

* User Interface Design
* Graphic Design

## License

```
The MIT License (MIT)

Copyright (c) 2013 TheFinestArtist

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```
