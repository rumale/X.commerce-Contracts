# X.commerce Open Commerce Language Processes

Copyright (c) 2011 X.commerce

## Domain Contributors

If you will be adding a new domain contract, please be sure to include it as a module in the pom.xml file in this root directory.

The 'all' project has a dependency on all domain contracts.  It serves as a single artifact that our tools can use to get access to all domain contracts. Please also add a dependency in all/pom.xml as well if you are introducing a new domain.

We are in the process of defining the processes for external contributors to provide feedback and be part of the process for defining these contracts so please stay tuned.

## Current Contract Statuses:

### INTERNAL DRAFT

These deliverables that are work in progress. This is still being discussed, and implementors should not consider this version as stable. 

* core
* inventory
* offermanagement
* productinformationmanagement
* shipping
 
### WORKING DRAFT

These deliverables are stable working draft that has been published for comments. This is still being discussed, and implementors should not consider this version as stable.

* payment
* emailmarketing
* paidsearchadvertising

### CANDIDATE RECOMMENDATION

These deliverables are stable working draft that has been published to gather implementation experience and feedback 

* marketplace
* producttaxonomy

### PROPOSED RECOMMENDATION

These deliverables are candidate recommendation that has incorporated implementation experience and feedback and which is being proposed for recommendation. A minimum number of implementations must exist before a candidate recommendation is proposed. 
 
### RECOMMENDATION

These deliverables are proposed recommendation that is deemed appropriate for widespread adoption 
