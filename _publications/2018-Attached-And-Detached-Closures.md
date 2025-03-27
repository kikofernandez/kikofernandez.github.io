---
title: "Attached and detached closures in actors"
collection: publications
permalink: /publication/attached-and-detached-closures
date: 2018-11-05
venue: AGERE
paperurl: 'https://dl.acm.org/citation.cfm?id=3281371'
---



Expressive actor models combine aspects of functional programming into the pure actor model enriched with futures. Such functional features include first-class closures which can be passed between actors and chained on futures. Combined with mutable objects, this opens the door to race conditions. In some situations, closures may not be evaluated by the actor that created them yet may access fields or objects owned by that actor. In other situations, closures may be safely fired off to run as a separate task.

This paper discusses the problem of who can safely evaluate a closure to avoid race conditions, and presents the current solution to the problem adopted by the Encore language. The solution integrates with Encore's capability type system, which influences whether a closure is attached and must be evaluated by the creating actor, or whether it can be detached and evaluated independently of its creator.

Encore's current solution to this problem is not final or optimal. We conclude by discussing a number of open problems related to dealing with closures in the actor model.


<!-- ACM DL Article: Attached and detached closures in actors -->
<div class="acmdlitem" id="item3281371"><img src="//dl.acm.org/images/oa.gif" width="25" height="25" border="0" alt="ACM DL Author-ize service" style="vertical-align:middle"/><a href="https://dl.acm.org/authorize?N675833" title="Attached and detached closures in actors">Attached and detached closures in actors</a><div style="margin-left:25px"><a href="http://dl.acm.org/author_page.cfm?id=99659275314" >Elias Castegren</a>, <a href="http://dl.acm.org/author_page.cfm?id=81100391212" >Dave Clarke</a>, <a href="http://dl.acm.org/author_page.cfm?id=99659211382" >Kiko Fernandez-Reyes</a>, <a href="http://dl.acm.org/author_page.cfm?id=81323497904" >Tobias Wrigstad</a>, <a href="http://dl.acm.org/author_page.cfm?id=99659178400" >Albert Mingkun Yang</a><br />AGERE 2018 Proceedings of the 8th ACM SIGPLAN International Workshop on Programming Based on Actors, Agents, and Decentralized Control, 2018</div></div>
<!-- ACM DL Bibliometrics: Attached and detached closures in actors-->
<div class="acmdlstat" id ="stats3281371"><iframe src="https://dl.acm.org/authorizestats?N675833" width="100%" height="30" scrolling="no" frameborder="0">frames are not supported</iframe></div>
