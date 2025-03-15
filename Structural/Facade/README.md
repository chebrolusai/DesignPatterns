<h1 align="center">Facade Pattern</h1>

## Problem
When a very complex internal system is present, and no one cares about hot it works. You want to do very little and get things done. In fact there are a set of things you want to do with a system and you want it hassle free and easy.

## Issues
Normally speaking, if you think from a client perspective
- you must understand on a high level how things work. Atleast which classes are used and the order in which things are supposed to be done
- Worst case, something changes - you HAVE to take care of it. You are kind of very tightly integrated into the internal system and its changes. So, you will need to be updated about the changes, could be additions, removals or updates
- Now, if there are multiple places where you would interact with the system, possibly doing the same set of operations - it is not such a good way to handle things

## Facade Design Pattern
The facade pattern aims to just simplify things for the client. You assume a set of common operations, hide the internal details and keep the clients away from unwanted information. So, allow the client to make a minimum number of requests, and theres another layer between client and the internal system which is this Facade, which handles what the components internally must do based on a request from the client.

## Implementation
- Keep your internal system as it is, make your facade identify the dependencies and the order
- Identify what are the common set of operations or which requests kind of propagate to the same final thing. You can make some decent assumptions and default cases
- Ensure you expose functions in such a way that, if the internal system changes - the facade changes, minimal changes must happen on the client side
