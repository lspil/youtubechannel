module m1 {

  exports read to m2;
  // not exported then it can't be accessed even by reflection
  // class path ----> module path
}