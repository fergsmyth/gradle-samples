Sample multi project to show how to rename build.gradle files to the name of the sub project.

*Note*

For this project: 

1. The java plugin is applied to all sub projects configuring all projects with the default tasks (e.g compile, jar, test)

2. The build file name of the root project is changed to root.gradle. Root build.gradle must be renamed (See Pitfall 1)

3. Finally each child project is looped through changing the name of the build file to the name of the subproject. (See Pitfall 2)

Pitfalls:

1. If the root file isn't changed it will fail to find build.gradle file. The error is ambiguous as it doesn't indicate a missing build.gradle files but that the task you are executing can't be found. *Task 'build' not found in root project.*

2. Be careful to rename the child project build.gradle files correctly as it may not be obvious that the correct build.gradle isn't being found. By applying the java plugin to all sub projects running a "gradle build" will execute all tasks with default settings per sub project even if a sub project has no build.gradle. 

To see examples of Pitfall 2 try executing line 6 out in the settings.gradle. 
In one case subproject 1 will print otherwise subproject 2 will print. 
Subproject 3 will never print.
