```groovy
def myMethod(List<String> list) {
    if (list == null || list.isEmpty()) {
        return [] as List<String> // Explicitly return an empty list
    }
    //Some code here
    return list // or process list
}
```