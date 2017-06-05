# Hello-Akka

## Source 

[Akka Cookbook - 1: Diving into Akka - Creating an Akka Scala SBT project from scratch](https://www.packtpub.com/mapt/book/Application%20Development/9781785288180/1/ch01lvl1sec9/creating-an-akka-scala-sbt-project-from-scratch)

## Setup

```
$ mkdir Hello-Akka
$ cd Hello-Akka
$ sbt
   WARN: No sbt.version set in project/build.properties, base directory: C:\Users\j4guerre\Documents\Projects\scala\akka\Hello-Akka
   [info] Set current project to hello-akka (in build file:/C:/Users/j4guerre/Documents/Projects/scala/akka/Hello-Akka/)
   
  > set name := "Hello-Akka"
    [info] Defining *:name
    [info] The new value will be used by *:description, *:normalizedName and 5 others.
    ...
    [info] Reapplying settings...
      
  > set version := "1.0"
    [info] Defining *:version
    [info] The new value will be used by *:isSnapshot, *:projectId and 3 others.
    ...
    [info] Reapplying settings...
  
  > set scalaVersion := "2.11.7"
    [info] Defining *:scalaVersion
    [info] The new value will be used by *:allDependencies, *:crossScalaVersions and 13 others.
    ...
    [info] Reapplying settings...
  
  > session save
     [info] Reapplying settings...

  > exit

$

```

### libraryDependencies


1. Open, and add the following 

```
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.4"
```
    

2. Run

```
$ sbt update
   Updated file C:\Users\j4guerre\Documents\Projects\scala\akka\Hello-Akka\project\build.properties setting sbt.version to: 0.13.15
   [info] Loading project definition from C:\Users\j4guerre\Documents\Projects\scala\akka\Hello-Akka\project
   [info] Updating {file:/C:/Users/j4guerre/Documents/Projects/scala/akka/Hello-Akka/project/}hello-akka-build...
   [info] Resolving org.fusesource.jansi#jansi;1.4 ...
   [info] Done updating.
   [info] Set current project to Hello-Akka (in build file:/C:/Users/j4guerre/Documents/Projects/scala/akka/Hello-Akka/)
   [info] Updating {file:/C:/Users/j4guerre/Documents/Projects/scala/akka/Hello-Akka/}hello-akka...
   [info] Resolving org.sonatype.oss#oss-parent;7 ...
   [info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-library/2.11.7/scala-library-2.11.7.jar ...
   [info]  [SUCCESSFUL ] org.scala-lang#scala-library;2.11.7!scala-library.jar (547ms)
   [info] downloading https://repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.11/2.4.4/akka-actor_2.11-2.4.4.jar ...
   [info]  [SUCCESSFUL ] com.typesafe.akka#akka-actor_2.11;2.4.4!akka-actor_2.11.jar (347ms)
   [info] downloading https://repo1.maven.org/maven2/com/typesafe/config/1.3.0/config-1.3.0.jar ...
   [info]  [SUCCESSFUL ] com.typesafe#config;1.3.0!config.jar(bundle) (53ms)
   [info] downloading https://repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.11/0.7.0/scala-java8-compat_2.11-0.7.0.jar ...
   [info]  [SUCCESSFUL ] org.scala-lang.modules#scala-java8-compat_2.11;0.7.0!scala-java8-compat_2.11.jar(bundle) (82ms)
   [info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-compiler/2.11.7/scala-compiler-2.11.7.jar ...
   [info]  [SUCCESSFUL ] org.scala-lang#scala-compiler;2.11.7!scala-compiler.jar (1398ms)
   [info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.11.7/scala-reflect-2.11.7.jar ...
   [info]  [SUCCESSFUL ] org.scala-lang#scala-reflect;2.11.7!scala-reflect.jar (460ms)
   [info] downloading https://repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_2.11/1.0.4/scala-xml_2.11-1.0.4.jar ...
   [info]  [SUCCESSFUL ] org.scala-lang.modules#scala-xml_2.11;1.0.4!scala-xml_2.11.jar(bundle) (95ms)
   [info] downloading https://repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.11/1.0.4/scala-parser-combinators_2.11-1.0.4.jar ...
   [info]  [SUCCESSFUL ] org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4!scala-parser-combinators_2.11.jar(bundle) (93ms)
   [info] downloading https://repo1.maven.org/maven2/jline/jline/2.12.1/jline-2.12.1.jar ...
   [info]  [SUCCESSFUL ] jline#jline;2.12.1!jline.jar (59ms)
   [info] Done updating.
   [success] Total time: 4 s, completed Jun 5, 2017 12:38:59 PM
```