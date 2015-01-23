# FridayJanuary23

- I've spent a great deal of time in playing around with R, R Studio, and ROpenSci to determine if I wanted to do this on Windows or on Ubuntu.
 - My conclusion was that I could do this on Ubuntu, but I'd be restricting myself due to its use on my laptop, so I went with Windows on the desktop.
 - Secondary conclusion: any attempts to rush an installation or setup will result in failure; this work must be done in a particular order such that everything can install on top of another installation.
- After finally getting all of the setup completed, which took longer than expected, I began by seeing if ROpenSci and the Musemeta code would work for me.
 - I faced issues almost immediately with server replies and code running.
- More experimentation and attempts to gather data are required, but it looks like R will be the best option yet for gathering the required data.
 - Though the <met()> command works well every time, there appears to be an issue with the <scrapi()> commands. 
 - It is necessary to use scrapi to grab certain data for later grabbing, even with the <met()> command.
 - To this end I submitted an issue to https://github.com/ropensci/musemeta, specifically the issue is located: https://github.com/ropensci/musemeta/issues/8
  - An update has been given and it looks like scrapi is down, a developer (Scott Chamberlain) is working on the issue. Amazing response time on a still in development R tool.