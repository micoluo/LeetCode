# This respiratory includes my LeetCode practice. 

## Pushing Java Code using Terminal (Mac)

To push your Java code to GitHub from a Mac, follow these steps:

1. Navigate to Your Project Directory:
   cd /path/to/your/project

2. Initialize a Local Git Repository:
   git init

3. Create a `.gitignore` File:
   - Create the `.gitignore` file:
     touch .gitignore
   - Open the `.gitignore` file with Nano or any text editor:
     nano .gitignore
   - Add the following lines to the `.gitignore` file:
     - **`.DS_Store`**: macOS-specific file that stores folder customizations.
     - **`.bin/`**: Directory containing compiled binary files.
     - **`.classpath`**: Eclipse-specific file for classpath settings.
     - **`.project`**: Eclipse-specific file for project metadata.
     - **`.settings/`**: Directory containing Eclipse-specific settings.
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


## Push Java Code using Eclipse:
Check out this YouTube video: https://www.youtube.com/watch?app=desktop&v=LPT7v69guVY

Make sure using token rather than password:
1. login to your GitHub account
2. go to https://github.com/settings/tokens
3. click on "Generate new token"
4. make necessary selections (but must select repo)
5. click on "save"
6. System will have a token
7. use this token instead of a password in the eclipse or other tools you are using


## Delete a Local Respiratory
- rm -rf .git
