object main extends App {

 def p(i: Int) {
   val c = (i % 23) + 232
   print(s"\033[48;5;${c}m ")
 }

 for (y <- (-1d until 1d by .06d)) {
   for (x <- (-2d until .5d by .02d)) {
     p(f(x, y))
	}
	println(Console.RESET)
  }
	   
	def f(x: Double, y: Double): Int = {
	    var zx = 0d
		var zy = 0d
		var iter = 10000
		while (zx * zx + zy * zy < 4d && iter > 0) {
			val tmp = zx * zx - zy * zy + x
			zy = 2d * zx * zy + y
			zx = tmp
			iter -= 1
		}
		iter
	}

}
       