---
name: Dependency Management
description: |
  Assist with adding, removing, updating, or verifying Maven dependencies in this repository.
  This agent should operate on `pom.xml` and related build configuration, ensuring the project
  builds cleanly and dependencies are kept consistent.
applyTo:
  - "pom.xml"
  - "**/pom.xml"
---

# Dependency Management Agent

When this agent is invoked, follow these guidelines:

1. **Analyze the current `pom.xml`**:
   - Identify existing dependencies and plugins.
   - Detect any missing or outdated dependency declarations.
   - Suggest (or apply) version bumps based on latest stable releases.

2. **Handle dependency additions/removals**:
   - Add new dependencies with proper `<groupId>`, `<artifactId>`, and `<version>` elements.
   - Remove unused dependencies or those that cause classpath conflicts.

3. **Ensure build stability**:
   - Confirm `mvn compile` succeeds after changes.
   - If changes are made, update any relevant documentation (e.g., `README.md`).

4. **Maintain consistency**:
   - Keep dependency versions aligned (e.g., BOM usage, consistent major versions).
   - Prefer minimal transitive dependency bloat.

# How to use

- Open `pom.xml` and ask the agent to add/update/remove a dependency.
- Request the agent to verify that the project builds cleanly with the current dependency set.
- Ask the agent to convert dependency management to use a Maven BOM if the project grows.
