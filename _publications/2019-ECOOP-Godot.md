---
title: "Godot: All the Benefits of Implicit and Explicit Futures"
collection: publications
permalink: /publication/ecoop-godot
date: 2019-07-18
venue: ECOOP
paperurl: 'http://drops.dagstuhl.de/opus/volltexte/2019/10794/'
---


Concurrent programs often make use of futures, handles to the results of
asynchronous operations. Futures provide means to communicate not yet computed
results, and simplify the implementation of operations that synchronise on the
result of such asynchronous operations. Futures can be characterised as implicit
or explicit, depending on the typing discipline used to type them.

Current future implementations suffer from “future proliferation”, either at the
type-level or at run-time. The former adds future type wrappers, which hinders
subtype polymorphism and exposes the client to the internal asynchronous
communication architecture. The latter increases latency, by traversing nested
future structures at run-time. Many languages suffer both kinds.

Previous work offer partial solutions to the future proliferation problems; in
this paper we show how these solutions can be integrated in an elegant and
coherent way, which is more expressive than either system in isolation. We
describe our proposal formally, and state and prove its key properties, in two
related calculi, based on the two possible families of future constructs
(data-flow futures and control-flow futures). The former relies on static type
information to avoid unwanted future creation, and the latter uses an algebraic
data type with dynamic checks. We also discuss how to implement our new system
efficiently.
