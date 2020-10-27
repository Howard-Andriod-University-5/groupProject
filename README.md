Original App Design Project
===

# COVID-19 STATS

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
This mobile app provides up-to-date information about the COVID-19 pandemic using Google COVID-19 statistics data. The user will be able to look up information for specific locations such as testing sites, current infection and death rates, as well as prevention guidelines. In addition, user's can keep a "COVID Journal" to record their symptons/treatment, quarantine progress and keep track of places/people they visited.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Education/Public Information
- **Mobile:** 
    * Information will be available offline (real-time)
    * Can Upload audio entries into COVID Journal
    * Can enable location to instantly provide relevant statistics
- **Story:**
    * It provides users with an personal way to understand the current state of the COVID 19 pandemic. 
- **Market:**
    * The app is made for users who are generally concerned about COVID stats and want quick information.
    * The app specifically caters to users were potentially exposed to COVID-19 because it provides a private platform to track their health.
- **Habit:**
    * The passive user can easily check COVID-19 statistics at least once a day.
    * The active user who is concerned about being exposed to COVID can create a mobile journal.
- **Scope:**
    * The project's MVP can be completed in the timeline of the course. However, the design of the app (in terms of how data is displayed) will take considerable time and may not be finished in the time period.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User can view COVID-19 death and infection rates in the United States
* User can view COVID-19 death and infection rates by state in the United States
* User can view updated safety information
* User can login and create written and audio entries in a personal COVID Journal

**Optional Nice-to-have Stories**

* User can use their location to automatically view relevant COVID-19 stats
* User can get relevant information about testing centers near them (directions, phone number, website, etc.)
* User can download Journal in a pdf file to print or share
* User can save locations that they are interested in

### 2. Screen Archetypes

* Search
   * User can search for locations to see stats
* Stats Stream 
   * User can view list of stats for relevant locations
* Detail 
   * User can view more stats from a specific location
* Login 
   * User can login to access Covid Journal
* Journal Stream
   * User can view all the Journal entries they have made
* Entry Creation 
   * User can edit text or add audio to post a journal entry


### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Location Stats
* COVID-19 Journal
* Logout 

**Flow Navigation** (Screen to Screen)

* Login
   * => Location Stream
* Location Stats Stream
   * => Location Search
       * => Location Stats Stream
           * => Location Detail
* COVID-19 Journal Stream
   * => Entry Creation

## Wireframes
### [BONUS] Digital Wireframes & Mockups
<img src="wireframes.png" width=600>
<img src="Wireframe.jpg" width=300>
<img src="wirframe_login.jpg" width=300>
### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
[Add table of models]
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
