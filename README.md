# Scala Auxiliary Constructor Pitfall

This repository demonstrates a common error in Scala related to auxiliary constructors and the necessity of handling default values appropriately.  The code showcases a scenario where omitting a default value in the primary constructor results in a compilation error if not addressed by an auxiliary constructor.

## Bug Description

In Scala, when defining a class with a primary constructor that lacks a default value for a parameter, attempting to create an instance without providing a value for that parameter results in a compilation error. This can be easily avoided using auxiliary constructors or defining a default value in the primary constructor itself.

## Solution

The provided solution demonstrates how to use an auxiliary constructor to avoid the error. If you need a default value for a parameter, you must explicitly create an auxiliary constructor that provides that default.  Alternatively, providing a default parameter value within the primary constructor is the more direct solution.
