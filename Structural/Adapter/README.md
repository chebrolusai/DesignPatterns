<h1 align="center">Adapter Pattern</h1>

## Problem
You have an existing system, and you now want to integrate or use something new. You also want to keep the current system implementation lying around for any legacy system usecases.
So you now need your system to handle something new - it could be a third party or anything external or a new version of something, keeping the old as it is. The problem is, this new system to be integrated with the existing system is a problem as both of them work differently. More specifically, the new system is incompatible with how your current system is designed to work.

## Issues
- You cannot directly plug in the external component without modifying the system or the component itself
- Even If you modify the external component (assuming you even have access to its code), you risk breaking its functionality somwhere you do not know
- You could write very specific custom integrations as a work around, but where is the end to this?

## Adapter Design Pattern
This allows both the implementations to stay as they are, but act as a bridge between those two incompatible interfaces. Essentially, we try to wrap up the calls made using this bridge.

## Implementation
- You need the adapter class to implement the same interface the old system needs, this makes the adapter compatible with old system
- You will need to translate calls to the new system within the adapter
- You can use an object of the new system, or use inheritance to acheive the same
- Keep it light weight and make it handle the conversations

## Note
The idea of the Adapter pattern is to not include extensive new business logic to make this work. If you are diving deep into complex integrations and lots of new logic. This was not a use case for the adapter design pattern. You might want to get rid of the old system all together.

