# This respiratory includes my LeetCode practice. 

## Pushing Java Code to GitHub (Mac)

To push your Java code to GitHub from a Mac, follow these steps:

1. Navigate to Your Project Directory:
   cd /path/to/your/project

2. Initialize a Git Repository:
   git init

3. Create a `.gitignore` File:
   - Create the `.gitignore` file:
     touch .gitignore
   - Open the `.gitignore` file with Nano or any text editor:
     nano .gitignore
   - Add the following lines to the `.gitignore` file:
     .DS_Store          # macOS specific files
     .classpath         # Eclipse specific files
     .project           # Eclipse specific files
     .settings/         # Eclipse specific files
   - Save and exit (in Nano: Press `Ctrl + X`, then `Y` to confirm, and press `Enter`).

4. Add, Commit, Connect, and Push:
   - Add files to the staging area:
     git add .
   - Commit the changes:
     git commit -m "First commit"
   - Add the remote repository URL:
     git remote add origin <repository>
   - Push the changes to the `main` branch:
     git push origin main

5. Later Updates:
   - Add modified files to the staging area:
     git add path/to/your/ModifiedFile.java
   - Commit the updates:
     git commit -m "Update"
   - Push the updates to the `main` branch:
     git push origin main
