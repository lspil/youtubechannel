import hello.HelloWorld;

module main {

    requires static hello;
    requires static example;

    uses HelloWorld; // we would like to use implementions of the HW interface
}
