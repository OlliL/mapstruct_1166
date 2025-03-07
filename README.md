This repository is to have a showcase for mapstruct Issue [#1166](https://github.com/mapstruct/mapstruct/issues/1166)
--
There are several mappers to show what possibilities where tried to work around the issue. There are JUnit-Tests for every mapper which are failing or succeeding as described below.

# Working Mappers

## [EntityMapperAfterMappingEntity](https://github.com/OlliL/mapstruct_1166/blob/main/showcase/src/main/java/net/salatschuessel/showcase/mapper/EntityMapperAfterMappingEntity.java)
This is a bad solution because imagine you have 200 Entites with plenty of different EntityIds in it as multiple properties - you would need to write a custom AfterMapping method for each of those entites. Pretty bad...

## [EntityMapperSeperate](https://github.com/OlliL/mapstruct_1166/blob/main/showcase/src/main/java/net/salatschuessel/showcase/mapper/EntityMapperSeperate.java)
This could work, but you would need to make sure every dev working with the project uses seperate id mappers, and none is ever useing "id.value" somewhere - that seems not practical and will fail at one point.

So - both are no viable solutions to go on with.

# Not working Mappers
##  [EntityMapperAfterMapping](https://github.com/OlliL/mapstruct_1166/blob/main/showcase/src/main/java/net/salatschuessel/showcase/mapper/EntityMapperAfterMapping.java)
**This would have been the best solution so far** as this could be a global @AfterMapping implementation which every mapper just uses and it would fix every problem in the whole project. Unfortunally it does not work because for whatever reason, if the returned value of an afterMapping method is null, its discarded (why..... just why....) this could have solved all the issues.

## [EntityMapperConditional](https://github.com/OlliL/mapstruct_1166/blob/main/showcase/src/main/java/net/salatschuessel/showcase/mapper/EntityMapperConditional.java)
This also does not work, because in the generated code, the Target Object is created regardles of what the condition returns. Its only used to pass the source property to the target object or null.

## [EntityMapperStandard](https://github.com/OlliL/mapstruct_1166/blob/main/showcase/src/main/java/net/salatschuessel/showcase/mapper/EntityMapperStandard.java)
Thats the mapper everyone would write.... but well its obvious it would create empty Objects.

## [EntityMapperStandardCheckNull](https://github.com/OlliL/mapstruct_1166/blob/main/showcase/src/main/java/net/salatschuessel/showcase/mapper/EntityMapperStandardCheckNull.java)
The extra added null checks don't change the outcome.
