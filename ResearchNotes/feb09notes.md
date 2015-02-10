#Feb 09
- Grabbed all the source code from the 190 search results page manually. I navigated to every page and viewed the source code, then saved it.
- Once I had the over 6,000 lines of code I had to figure out how to get the only line of code I wanted:
 - I wanted the 90 URLs that gave me the six digit ID I need to grab the base data for clean up.
 - The first job is (in Notepad++) to Find: '<div class="list-view-object-info"> ' and Replace: '<div class="list-view-object-info">'
 - Then: Find: '<div class="list-view-object-info">\r' Replace: '<div class="list-view-object-info">'
 - Then: Find: '<div class="list-view-object-info">\n' Replace: '<div class="list-view-object-info">'
- Every document must be manually dealt with for the next step
 - Mark all of the lines that contain '<div class="list-view-object-info">'
 - I now have the URL lines marked and so I can select Search>Bookmarked>Remove Unmarked Lines
 - This leaves me with the 90 lines I need.
- Reopen every document (Notepad++ is a wonder for opening them all in one window)
 - Now Find: '<div class="list-view-object-info">                                    <a href="/collection/the-collection-online/search/' Replace: ''
 - Set Find/Replace to Extended
 - Find: '?rpp=90&amp;pg=' Replace: '\n'
 - select Search>Bookmarked>Remove Unmarked Lines
 - Find: ' ' Replace: ''
 - Find: '\n' Replace: ','
- We now need to combine all of the files.

\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
- I realised that after I did the first major steps to get it down to just 90 lines per file I could combine them all in the command line and do the remainder from there.