package Activity

class Exercise_1 {

	    static void main(args) {
        //Un-initialized variables
        def x //In Groovy
        int y //In Java
        
        //Array
        def arr = [1, 2.0, "Subbu", true, x, y]
        
        arr.each { println "Value is: " + it +". Data type is: " + it.getClass() }
    }
}