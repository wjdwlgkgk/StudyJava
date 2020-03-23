var func1 = function (name) {
    print("Hi there from javascript," + name);
    return "greetings from javscript";
}

var func2 = function (object) {
    print("JS class definition : " + Object.prototype.toString().call(object));
}


var a = "asdfasdfasdfsad asdfadsfasdfasdfasf         ";

var func3 = function (){

    var values = matcher("exec" , 'snmp {', "^snmp \{", "^\}$");
    print("values : " + values);
    // print("a.length : " + a.length);
    // print("a.trim.length : " + a.trim().length);
}



var func4 = function(){
    var a = "asdfasdfasdf";

    if(a.match(/^interface.*/gi)){
        print("a = 같다.");
    } else {
        print("a = 다르다.");
    }

}






function matcher(text, regex, opt) {
    var ret;
    var text = 'class-map match-all test';
    var match = new RegExp(regex);
    ret = match.exec(text);
    print(ret);
    return ret
}


