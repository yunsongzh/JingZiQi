[33mcommit a450a4e34649942cdcf2cc9febf75f97239f23b7[m
Author: yunsong <yunsongzh@163.com>
Date:   Fri Apr 20 09:44:03 2018 +0800

    First commit.

[1mdiff --git a/.gitignore b/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..39fb081[m
[1m--- /dev/null[m
[1m+++ b/.gitignore[m
[36m@@ -0,0 +1,9 @@[m
[32m+[m[32m*.iml[m
[32m+[m[32m.gradle[m
[32m+[m[32m/local.properties[m
[32m+[m[32m/.idea/workspace.xml[m
[32m+[m[32m/.idea/libraries[m
[32m+[m[32m.DS_Store[m
[32m+[m[32m/build[m
[32m+[m[32m/captures[m
[32m+[m[32m.externalNativeBuild[m
[1mdiff --git a/.idea/compiler.xml b/.idea/compiler.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..96cc43e[m
[1m--- /dev/null[m
[1m+++ b/.idea/compiler.xml[m
[36m@@ -0,0 +1,22 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="CompilerConfiguration">[m
[32m+[m[32m    <resourceExtensions />[m
[32m+[m[32m    <wildcardResourcePatterns>[m
[32m+[m[32m      <entry name="!?*.java" />[m
[32m+[m[32m      <entry name="!?*.form" />[m
[32m+[m[32m      <entry name="!?*.class" />[m
[32m+[m[32m      <entry name="!?*.groovy" />[m
[32m+[m[32m      <entry name="!?*.scala" />[m
[32m+[m[32m      <entry name="!?*.flex" />[m
[32m+[m[32m      <entry name="!?*.kt" />[m
[32m+[m[32m      <entry name="!?*.clj" />[m
[32m+[m[32m      <entry name="!?*.aj" />[m
[32m+[m[32m    </wildcardResourcePatterns>[m
[32m+[m[32m    <annotationProcessing>[m
[32m+[m[32m      <profile default="true" name="Default" enabled="false">[m
[32m+[m[32m        <processorPath useClasspath="true" />[m
[32m+[m[32m      </profile>[m
[32m+[m[32m    </annotationProcessing>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/copyright/profiles_settings.xml b/.idea/copyright/profiles_settings.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..e7bedf3[m
[1m--- /dev/null[m
[1m+++ b/.idea/copyright/profiles_settings.xml[m
[36m@@ -0,0 +1,3 @@[m
[32m+[m[32m<component name="CopyrightManager">[m
[32m+[m[32m  <settings default="" />[m
[32m+[m[32m</component>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/gradle.xml b/.idea/gradle.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..7ac24c7[m
[1m--- /dev/null[m
[1m+++ b/.idea/gradle.xml[m
[36m@@ -0,0 +1,18 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="GradleSettings">[m
[32m+[m[32m    <option name="linkedExternalProjectsSettings">[m
[32m+[m[32m      <GradleProjectSettings>[m
[32m+[m[32m        <option name="distributionType" value="DEFAULT_WRAPPED" />[m
[32m+[m[32m        <option name="externalProjectPath" value="$PROJECT_DIR$" />[m
[32m+[m[32m        <option name="modules">[m
[32m+[m[32m          <set>[m
[32m+[m[32m            <option value="$PROJECT_DIR$" />[m
[32m+[m[32m            <option value="$PROJECT_DIR$/app" />[m
[32m+[m[32m          </set>[m
[32m+[m[32m        </option>[m
[32m+[m[32m        <option name="resolveModulePerSourceSet" value="false" />[m
[32m+[m[32m      </GradleProjectSettings>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/misc.xml b/.idea/misc.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..5d19981[m
[1m--- /dev/null[m
[1m+++ b/.idea/misc.xml[m
[36m@@ -0,0 +1,46 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="EntryPointsManager">[m
[32m+[m[32m    <entry_points version="2.0" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="NullableNotNullManager">[m
[32m+[m[32m    <option name="myDefaultNullable" value="android.support.annotation.Nullable" />[m
[32m+[m[32m    <option name="myDefaultNotNull" value="android.support.annotation.NonNull" />[m
[32m+[m[32m    <option name="myNullables">[m
[32m+[m[32m      <value>[m
[32m+[m[32m        <list size="4">[m
[32m+[m[32m          <item index="0" class="java.lang.String" itemvalue="org.jetbrains.annotations.Nullable" />[m
[32m+[m[32m          <item index="1" class="java.lang.String" itemvalue="javax.annotation.Nullable" />[m
[32m+[m[32m          <item index="2" class="java.lang.String" itemvalue="edu.umd.cs.findbugs.annotations.Nullable" />[m
[32m+[m[32m          <item index="3" class="java.lang.String" itemvalue="android.support.annotation.Nullable" />[m
[32m+[m[32m        </list>[m
[32m+[m[32m      </value>[m
[32m+[m[32m    </option>[m
[32m+[m[32m    <option name="myNotNulls">[m
[32m+[m[32m      <value>[m
[32m+[m[32m        <list size="4">[m
[32m+[m[32m          <item index="0" class="java.lang.String" itemvalue="org.jetbrains.annotations.NotNull" />[m
[32m+[m[32m          <item index="1" class="java.lang.String" itemvalue="javax.annotation.Nonnull" />[m
[32m+[m[32m          <item index="2" class="java.lang.String" itemvalue="edu.umd.cs.findbugs.annotations.NonNull" />[m
[32m+[m[32m          <item index="3" class="java.lang.String" itemvalue="android.support.annotation.NonNull" />[m
[32m+[m[32m        </list>[m
[32m+[m[32m      </value>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="ProjectLevelVcsManager" settingsEditedManually="false">[m
[32m+[m[32m    <OptionsSetting value="true" id="Add" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Remove" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Checkout" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Update" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Status" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Edit" />[m
[32m+[m[32m    <ConfirmationsSetting value="0" id="Add" />[m
[32m+[m[32m    <ConfirmationsSetting value="0" id="Remove" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_7" default="true" assert-keyword="true" jdk-15="true" project-jdk-name="1.8" project-jdk-type="JavaSDK">[m
[32m+[m[32m    <output url="file://$PROJECT_DIR$/build/classes" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="ProjectType">[m
[32m+[m[32m    <option name="id" value="Android" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/modules.xml b/.idea/modules.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..d73ea3f[m
[1m--- /dev/null[m
[1m+++ b/.idea/modules.xml[m
[36m@@ -0,0 +1,9 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="ProjectModuleManager">[m
[32m+[m[32m    <modules>[m
[32m+[m[32m      <module fileurl="file://$PROJECT_DIR$/JingZiQi.iml" filepath="$PROJECT_DIR$/JingZiQi.iml" />[m
[32m+[m[32m      <module fileurl="file://$PROJECT_DIR$/app/app.iml" filepath="$PROJECT_DIR$/app/app.iml" />[m
[32m+[m[32m    </modules>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/runConfigurations.xml b/.idea/runConfigurations.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..7f68460[m
[1m--- /dev/null[m
[1m+++ b/.idea/runConfigurations.xml[m
[36m@@ -0,0 +1,12 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="RunConfigurationProducerService">[m
[32m+[m[32m    <option name="ignoredProducers">[m
[32m+[m[32m      <set>[m
[32m+[m[32m        <option value="org.jetbrains.plugins.gradle.execution.test.runner.AllInPackageGradleConfigurationProducer" />[m
[32m+[m[32m        <option value="org.jetbrains.plugins.gradle.execution.test.runner.TestClassGradleConfigurationProducer" />[m
[32m+[m[32m        <option value="org.jetbrains.plugins.gradle.execution.test.runner.TestMethodGradleConfigurationProducer" />[m
[32m+[m[32m      </set>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/app/.gitignore b/app/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..796b96d[m
[1m--- /dev/null[m
[1m+++ b/app/.gitignore[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32m/build[m
[1mdiff --git a/app/app-debug.apk b/app/app-debug.apk[m
[1mnew file mode 100644[m
[1mindex 0000000..6e89f09[m
Binary files /dev/null and b/app/app-debug.apk differ
[1mdiff --git a/app/app-release.apk b/app/app-release.apk[m
[1mnew file mode 100644[m
[1mindex 0000000..7239840[m
Binary files /dev/null and b/app/app-release.apk differ
[1mdiff --git a/app/build.gradle b/app/build.gradle[m
[1mnew file mode 100644[m
[1mindex 0000000..3b2609f[m
[1m--- /dev/null[m
[1m+++ b/app/build.gradle[m
[36m@@ -0,0 +1,30 @@[m
[32m+[m[32mapply plugin: 'com.android.application'[m
[32m+[m
[32m+[m[32mandroid {[m
[32m+[m[32m    compileSdkVersion 24[m
[32m+[m[32m    buildToolsVersion "25.0.0"[m
[32m+[m[32m    defaultConfig {[m
[32m+[m[32m        applicationId "com.zys.jingziqi"[m
[32m+[m[32m        minSdkVersion 22[m
[32m+[m[32m        targetSdkVersion 24[m
[32m+[m[32m        versionCode 1[m
[32m+[m[32m        versionName "1.0"[m
[32m+[m[32m        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"[m
[32m+[m[32m    }[m
[32m+[m[32m    buildTypes {[m
[32m+[m[32m        release {[m
[32m+[m[32m            minifyEnabled false[m
[32m+[m[32m            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mdependencies {[m
[32m+[m[32m    compile fileTree(dir: 'libs', include: ['*.jar'])[m
[32m+[m[32m    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {[m
[32m+[m[32m        exclude group: 'com.android.support', module: 'support-annotations'[m
[32m+[m[32m    })[m
[32m+[m[32m    compile 'com.android.support:appcompat-v7:24.2.1'[m
[32m+[m[32m    compile 'com.android.support.constraint:constraint-layout:1.0.2'[m
[32m+[m[32m    testCompile 'junit:junit:4.12'[m
[32m+[m[32m}[m
[1mdiff --git a/app/proguard-rules.pro b/app/proguard-rules.pro[m
[1mnew file mode 100644[m
[1mindex 0000000..dc62e41[m
[1m--- /dev/null[m
[1m+++ b/app/proguard-rules.pro[m
[36m@@ -0,0 +1,25 @@[m
[32m+[m[32m# Add project specific ProGuard rules here.[m
[32m+[m[32m# By default, the flags in this file are appended to flags specified[m
[32m+[m[32m# in F:\Android\AndroidSDK/tools/proguard/proguard-android.txt[m
[32m+[m[32m# You can edit the include path and order by changing the proguardFiles[m
[32m+[m[32m# directive in build.gradle.[m
[32m+[m[32m#[m
[32m+[m[32m# For more details, see[m
[32m+[m[32m#   http://developer.android.com/guide/developing/tools/proguard.html[m
[32m+[m
[32m+[m[32m# Add any project specific keep options here:[m
[32m+[m
[32m+[m[32m# If your project uses WebView with JS, uncomment the following[m
[32m+[m[32m# and specify the fully qualified class name to the JavaScript interface[m
[32m+[m[32m# class:[m
[32m+[m[32m#-keepclassmembers class fqcn.of.javascript.interface.for.webview {[m
[32m+[m[32m#   public *;[m
[32m+[m[32m#}[m
[32m+[m
[32m+[m[32m# Uncomment this to preserve the line number information for[m
[32m+[m[32m# debugging stack traces.[m
[32m+[m[32m#-keepattributes SourceFile,LineNumberTable[m
[32m+[m
[32m+[m[32m# If you keep the line number information, uncomment this to[m
[32m+[m[32m# hide the original source file name.[m
[32m+[m[32m#-renamesourcefileattribute SourceFile[m
[1mdiff --git a/app/src/androidTest/java/com/zys/jingziqi/ExampleInstrumentedTest.java b/app/src/androidTest/java/com/zys/jingziqi/ExampleInstrumentedTest.java[m
[1mnew file mode 100644[m
[1mindex 0000000..ae4c37c[m
[1m--- /dev/null[m
[1m+++ b/app/src/androidTest/java/com/zys/jingziqi/ExampleInstrumentedTest.java[m
[36m@@ -0,0 +1,26 @@[m
[32m+[m[32mpackage com.zys.jingziqi;[m
[32m+[m
[32m+[m[32mimport android.content.Context;[m
[32m+[m[32mimport android.support.test.InstrumentationRegistry;[m
[32m+[m[32mimport android.support.test.runner.AndroidJUnit4;[m
[32m+[m
[32m+[m[32mimport org.junit.Test;[m
[32m+[m[32mimport org.junit.runner.RunWith;[m
[32m+[m
[32m+[m[32mimport static org.junit.Assert.*;[m
[32m+[m
[32m+[m[32m/**[m
[32m+[m[32m * Instrumentation test, which will execute on an Android device.[m
[32m+[m[32m *[m
[32m+[m[32m * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>[m
[32m+[m[32m */[m
[32m+[m[32m@RunWith(AndroidJUnit4.class)[m
[32m+[m[32mpublic class ExampleInstrumentedTest {[m
[32m+[m[32m    @Test[m
[32m+[m[32m    public void useAppContext() throws Exception {[m
[32m+[m[32m        // Context of the app under test.[m
[32m+[m[32m        Context appContext = InstrumentationRegistry.getTargetContext();[m
[32m+[m
[32m+[m[32m        assertEquals("com.zys.jingziqi", appContext.getPackageName());[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/app/src/main/AndroidManifest.xml b/app/src/main/AndroidManifest.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..3c6f572[m
[1m--- /dev/null[m
[1m+++ b/app/src/main/AndroidManifest.xml[m
[36m@@ -0,0 +1,23 @@[m
[32m+[m[32m<?xml version="1.0" encoding="utf-8"?>[m
[32m+[m[32m<manifest xmlns:android="http://schemas.android.com/apk/res/android"[m
[32m+[m[32m    package="com.zys.jingziqi">[m
[32m+[m
[32m+[m[32m    <application[m
[32m+[m[32m        android:allowBackup="true"[m
[32m+[m[32m        android:icon="@drawable/name_background"[m
[32m+[m[32m        android:label="@string/app_name"[m
[32m+[m[32m        android:supportsRtl="true"[m
[32m+[m[32m        android:theme="@style/AppTheme">[m
[32m+[m[32m        <activity android:name=".MainActivity">[m
[32m+[m[32m            <intent-filter>[m
[32m+[m[32m                <action android:name="android.intent.action.MAIN" />[m
[32m+[m
[32m+[m[32m                <category android:name="android.intent.category.LAUNCHER" />[m
[32m+[m[32m            </intent-filter>[m
[32m+[m[32m        </activity>[m
[32m+[m[32m        <activity[m
[32m+[m[32m            android:name=".GameActivity">[m
[32m+[m[32m        </activity>[m
[32m+[m[32m    </application>[m
[32m+[m
[32m+[m[32m</manifest>[m
\ No newline at end of file[m
[1mdiff --git a/app/src/main/java/com/zys/jingziqi/ControlFragment.java b/app/src/main/java/com/zys/jingziqi/ControlFragment.java[m
[1mnew file mode 100644[m
[1mindex 0000000..1a9df73[m
[1m--- /dev/null[m
[1m+++ b/app/src/main/java/com/zys/jingziqi/ControlFragment.java[m
[36m@@ -0,0 +1,38 @@[m
[32m+[m[32mpackage com.zys.jingziqi;[m
[32m+[m
[32m+[m[32m/**[m
[32m+[m[32m * Created by mwzys on 2017/3/22.[m
[32m+[m[32m */[m
[32m+[m
[32m+[m[32mimport android.app.Fragment;[m
[32m+[m[32mimport android.os.Bundle;[m
[32m+[m[32mimport android.view.LayoutInflater;[m
[32m+[m[32mimport android.view.View;[m
[32m+[m[32mimport android.view.ViewGroup;[m
[32m+[m
[32m+[m[32mpublic class ControlFragment extends Fragment {[m
[32m+[m
[32m+[m[32m    @Override[m
[32m+[m[32m    public View onCreateView(LayoutInflater inflater, ViewGroup container,[m
[32m+[m[32m                             Bundle savedInstanceState) {[m
[32m+[m[32m        View rootView =[m
[32m+[m[32m                inflater.inflate(R.layout.fragment_control, container, false);[m
[32m+[m[32m        View main = rootView.findViewById(R.id.button_main);[m
[32m+[m[32m        View restart = rootView.findViewById(R.id.button_restart);[m
[32m+[m
[32m+[m[32m        main.setOnClickListener(new View.OnClickListener() {[m
[32m+[m[32m            @Override