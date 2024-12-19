# Unexpected Behavior of removeIf on MutableList in Kotlin

This repository demonstrates an unexpected behavior of the `removeIf` function when used with a `MutableList` in Kotlin. The issue arises when the lambda expression passed to `removeIf` modifies the list during iteration, leading to elements being skipped or incorrectly removed.

The example provided shows that the list is modified in place, which can cause unexpected behavior.

## Solution

The solution involves iterating over a copy of the list or using an alternative approach to remove elements based on a condition.
