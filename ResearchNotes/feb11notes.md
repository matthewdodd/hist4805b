#february11
- Decided to continue to clean up the huge amount of files:
- I began manually working on each file, hitting about 10, when I got annoyed that I had to work manually.
 - To fix this I built two MACROs to do the vast majority of the work for me:
  - I had the first MACRO remove all of the extra info that wasn't the six-digit identifier, and comma splice them all
  - The second MACRO saved and closed the document in Notepad++
 - After I had built the MACROs I was frustrated with myself, but I had one remaining step to go.
 - Using the Windows Command Prompt:
  - I navigated ('cd') to the folder I had all of my files in;
  - I then used the command 'ren *.html *.txt' to rename every file with a .html extension to a .txt extension to save time for decoding.
- I attempted to combine all of the files into one massive file and input this to RStudio with the museMeta library, but this crashes the program (as expected)