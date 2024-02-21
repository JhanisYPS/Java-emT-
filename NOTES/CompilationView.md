## Comand
```
java -XX:+PrintCompilation MyFirstClass
```

### Answer
---
```
     45    1       3       java.lang.StringLatin1::hashCode (42 bytes)
     47    2       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
     48    3       3       java.lang.String::coder (15 bytes)
     51    4       3       java.lang.Object::<init> (1 bytes)
     52    6       3       java.lang.String::isLatin1 (19 bytes)
     52    5       3       java.lang.String::hashCode (49 bytes)
     53    7       3       java.lang.Math::floorMod (10 bytes)
     53    9       3       java.util.ImmutableCollections$SetN::probe (56 bytes)
     54    8       3       java.lang.Math::floorDiv (22 bytes)
     54   10       3       java.lang.StringLatin1::equals (36 bytes)
     55   11       3       java.util.ImmutableCollections$SetN::hashCode (46 bytes)
     56   12       3       java.lang.String::equals (65 bytes)
     57   14       3       java.util.ImmutableCollections::emptySet (4 bytes)
     57   15       4       java.lang.StringLatin1::hashCode (42 bytes)
     58   13       3       java.util.Objects::equals (23 bytes)
     58   16       3       java.util.Set::of (4 bytes)
     59   18       3       java.util.Objects::requireNonNull (14 bytes)
     59   17       3       java.util.AbstractCollection::<init> (5 bytes)
     60   19       3       java.util.ImmutableCollections$AbstractImmutableSet::<init> (5 bytes)
     61   20       3       java.util.Set::of (66 bytes)
     61    1       3       java.lang.StringLatin1::hashCode (42 bytes)   made not entrant
     64   21       1       java.lang.module.ModuleDescriptor::name (5 bytes)
     64   22       3       java.lang.String::charAt (25 bytes)
     65   23       3       java.lang.StringLatin1::charAt (28 bytes)
     67   24       1       java.lang.module.ModuleReference::descriptor (5 bytes)
     69   26       3       java.util.ImmutableCollections$SetN$SetNIterator::hasNext (13 bytes)
     71   29       4       java.lang.Object::<init> (1 bytes)
     72   37     n 0       jdk.internal.misc.Unsafe::compareAndSetLong (native)
     72   33       3       java.util.ImmutableCollections$SetN$SetNIterator::next (47 bytes)
     73    4       3       java.lang.Object::<init> (1 bytes)   made not entrant
     74   39     n 0       jdk.internal.misc.Unsafe::compareAndSetObject (native)
     74   31       3       java.util.ImmutableCollections$MapN::probe (60 bytes)
     75   34   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)
     79   27       3       java.util.ImmutableCollections$SetN$SetNIterator::nextIndex (56 bytes)
     79   48       3       java.util.HashMap::putVal (300 bytes)
     80   35       3       java.util.concurrent.ConcurrentHashMap::addCount (279 bytes)
     81   53       4       java.lang.String::hashCode (49 bytes)
     82   25       3       java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
     82   36       3       java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
     83   43       3       java.util.HashMap::hash (20 bytes)
     84   49       3       java.util.HashMap::newNode (13 bytes)
     84    5       3       java.lang.String::hashCode (49 bytes)   made not entrant
     85   55       4       java.util.ImmutableCollections$SetN$SetNIterator::hasNext (13 bytes)
     87   50       3       java.util.HashMap::afterNodeInsertion (1 bytes)
     88   26       3       java.util.ImmutableCollections$SetN$SetNIterator::hasNext (13 bytes)   made not entrant
     89   47       3       java.util.HashMap$Node::<init> (26 bytes)
     89   53       4       java.lang.String::hashCode (49 bytes)   made not entrant
     90   46       3       java.util.HashMap::put (13 bytes)
     91   42       1       java.util.ImmutableCollections$SetN::size (5 bytes)
     91   32       1       java.lang.module.ResolvedModule::reference (5 bytes)
     92   41       3       java.lang.String::length (11 bytes)
     93   45       1       java.lang.module.ModuleDescriptor$Exports::source (5 bytes)
     93   38       3       java.util.concurrent.ConcurrentHashMap::putIfAbsent (8 bytes)
     94   40       3       java.util.concurrent.ConcurrentHashMap::casTabAt (21 bytes)
     95   28 Hello, World!      1
 java.util.KeyValueHolder::getKey (5 bytes)
```
