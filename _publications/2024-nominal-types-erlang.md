---
title: "Nominal Types for Erlang"
collection: publications
permalink: /publication/erlang24-nominal-types-erlang
date: 2024-07-01
venue: ACM SIGPLAN Erlang Workshop (Erlang)
---

Erlang is a functional programming language with structural type-checking. Opaque types are the only types with a nominal component, where their names are used for type-checking. Using opaque types for nominal typing is possible, but it limits the use of pattern-matching and deconstruction to the module where it is defined. 

To distinguish types by names without imposing extra constraints, we introduce the new concept of nominal types for Erlang, together with a well-tested type-checking implementation in Dialyzer. We define a new syntax for declaring nominal types and a set of rules that specify how nominal types should be type-checked with respect to other nominal types and non-nominal types, which is designed to ensure backwards compatibility. Nominal type-checking is implemented on top of Dialyzer's structural type-checking logic. Through testing in the Erlang/OTP codebase, we show that nominal types can encode Erlang's opaque types, thereby improving Dialyzer's performance and maintainability.

Download [here](https://dl.acm.org/doi/10.1145/3677995.3678191?cid=99659211382)
