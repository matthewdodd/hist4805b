# Week of February 01

- Scrapi remains down, not on ROpenSci but on the Met Museum, so as an interim procedure I manually scraped 30 objects for the identifier number.
- Once I had the identifier numbers I passed them through MuseMeta to grab the basic information of the items.
 - It took about 30 seconds to download all of the metadata.
 - A major complaint for the Met Museum: metadata should be standardised across all objects.
 - Period, date, or culture could be missing from any item, making any file format for standardisation a pain.
 - Dimensions have no standard either, sometimes given in inches, sometimes in centimetres, sometimes just height, sometimes overall.
 - Date has no standardization, will require work to standardize. Major complaint for the Met.
- The hardest part for this work cycle was to begin development of code that would take the returned values from ROpenSci's MuseMeta and put them into a more usable form for my work.
- USAGE (ENSURE REGEX IS SELECTED):
 - #0: Ctrl-H Find: , and Replace: ""
 - #1: Ctrl-H Find: \n\r and Replace: ,
 - #2: Ctrl-H Find: \r\n and Replace: ,
 - #3: Ctrl-H Find: ,\n and Replace: ""
- Knowing that work would be necessary to clean the data, I began by putting it through Notepad++ and running certain Find/Replace actions to force it into a .csv format style.
 - At this point I need to figure out how to sort the work and force in data area's (row/column) to fully fill in the table, even with NULL values
- A way that should work (in Excel/Libre Calc) is to sort by column (ascending/descending) and force over the rows and insert the required information as NULL.
 - Date column must be cleaned up (search by 'A.D.' or 'B.C') and clean the data so it follows the same format. Will be time consuming, but is necessary for proper graphing.
