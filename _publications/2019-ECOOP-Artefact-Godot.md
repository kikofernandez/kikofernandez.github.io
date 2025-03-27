---
title: "Godot: All the Benefits of Implicit and Explicit Futures (Artefact)"
collection: publications
permalink: /publication/ecoop-artefact-godot
date: 2019-07-18
venue: ECOOP
paperurl: 'http://drops.dagstuhl.de/opus/volltexte/2019/10778/'
---

This artifact contains an implementation of data-flow futures in terms of
control-flow futures, in the Scala language. In the implementation, we show
microbenchmarks that solve the three identified problems from the paper:

1. The Type Proliferation Problem,
2. The Fulfilment Observation Problem, and
3. The Future Proliferation Problem

There are also detailed instructions on design decisions that differ
from the formal semantics and restrictions on the limits of how much
can be encoded in the Scala language. We provide examples,
e.g., creation of a proxy service using data-flow futures,
as well as tests that exercise different parts of the type system.


# Scope

This artifact shows an implementation of the formal semantics of data-flow futures,
in terms of a library in the Scala programming language. It also show how far one can get
encoding data-flow futures in terms of control-flow futures, and pinpoints the places that
require modification of the compiler (or an advanced macro system).


# Content

The artifact package includes:
- Documentation in files `README.html`, and `README.pdf`.
- The Scala implementation of data-flow futures with tests and examples, in the Scala language (in folder `godot`).
- An assets folder used by the `README.html` file.
- A virtual machine `GodotArtefact.ova` that, under `/home/vagrant/Desktop/Godot-Artifact/`, contains
the same files as mentioned above.\footnote{This has been done for ease of reading, so that a reader does not need to change between host and target machine when reading instructions.}

# Getting the Artefact

The artefact endorsed by the Artifact Evaluation Committee is available free of charge on the Dagstuhl Research Online Publication Server (DROPS),
and on github, [https://github.com/kikofernandez/ecoop-artefact-godot](https://github.com/kikofernandez/ecoop-artefact-godot).

# Tested Platforms

The artifact disk image works on any platform running Oracle VirtualBox version 6.0.4
with 5 GiB of free disk space and 2 GiB of free RAM. The artifact also works on any machine
that has the Scala compiler installed.

# License

This artifact is provided under the MIT license.

# MD5 sum of the Artefact

```
d90b8cda99ad792ac9e97f65184087e9
```

# Size of the Artefact

```
2.94 GiB
```

# Acknowledgements

We thank the reviewers of the artifact for their helpful comments.
