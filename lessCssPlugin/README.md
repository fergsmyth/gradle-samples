lessCssPlugin:
1. Adds the less css plugin dependency to builscript
2. Sets up the source and destination files for less 
3. Adds a dependency from compileLess task to lesscss. Example of how to add to build process.

**Note**
Error:
	Task with path 'de.obqo.gradle.lesscss.LessExtension_Decorated@5bda657' not found in root project 'lessCssPlugin'.
Error occurs when adding dependsOn lesscss without using '' around task name.
