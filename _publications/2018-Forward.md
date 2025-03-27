---
title: "Forward to a Promising Future"
collection: publications
permalink: /publication/COORDINATION-2018-Forward-To-A-Promising-Future
date: 2018-06-21
venue: COORDINATION
paperurl: 'https://link.springer.com/chapter/10.1007%2F978-3-319-92408-3_7'
---


In many actor-based programming models, asynchronous method calls communicate their results using futures, where the fulfilment occurs under-the-hood. Promises play a similar role to futures, except that they must be explicitly created and explicitly fulfilled; this makes promises more flexible than futures, though promises lack fulfilment guarantees: they can be fulfilled once, multiple times or not at all. Unfortunately, futures are too rigid to exploit many available concurrent and parallel patterns. For instance, many computations block on a future to get its result only to return that result immediately (to fulfil their own future). To make futures more flexible, we explore a construct, forward, that delegates the responsibility for fulfilling the current implicit future to another computation. Forward reduces synchronisation and gives futures promise-like capabilities. This paper presents a formalisation of the forward construct, defined in a high-level source language, and a compilation strategy from the high-level language to a low-level, promised-based target language. The translation is shown to preserve semantics. Based on this foundation, we describe the implementation of forward in the parallel, actor-based language Encore, which compiles to C.


[Download paper here](http://uu.diva-portal.org/smash/get/diva2:1209721/FULLTEXT02.pdf)
