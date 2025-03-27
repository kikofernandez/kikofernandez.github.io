---
title: "Run, Actor, Run"
collection: publications
permalink: /publication/agere19-run-actor-run
date: 2019-10-22
venue: Workshop on Programming based on Actors, Agents, and Decentralized Control (AGERE!)
paperurl: '/files/agere19-preprint.pdf'
---


The actor paradigm supports the natural expression of concurrency. It has
inspired the development of several actor-based languages, whose adoption
depends, to a large extent, on the runtime characteristics (i.e.,the performance
and scaling behaviour) of programs written in these languages. This paper
investigates the relative runtime characteristics of Akka, CAF and Pony, based
on the Savina benchmarks.We observe that the scaling of many of the Savina
benchmarks does not reflect their categorization (into essentially sequential,
concurrent and parallel), that many programs have similar runtime
characteristics, and that their runtime behaviour may drastically change nature
(e.g.,go from essentially sequential to parallel) by tweaking some
parameters. These observations lead to our proposal of a single benchmark
program which we designed so that through tweaking of some knobs (we hope) we can
simulate most of the programs of the Savina suite.
