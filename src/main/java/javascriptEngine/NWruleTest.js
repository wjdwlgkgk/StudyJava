var input_text = new Array();
var total_cnt = 0;

function push_text(text) {
    input_text.push(text);
    total_cnt++;
}



function main(){
    var user = regexCnt("^username.* password 7" , "i" );

    if(user == 0){
        print("result = 0");
    }
}


function regexCnt(regex, input){
    print("regexCnt입장");
    print("regex = " + regex + "\n\n\n input = " + input + "\n\n\n\n");
    var cnt = 0;
    for(var k=0; k <input_text.length; k++){
        var values = matcher("exec", input_text[k], regex, input);

        if(values != null){
            cnt++;
        }
    }
    return cnt;
}


function matcher(type, text, regex, opt) {
    var ret;
    var match = new RegExp(regex);
    ret = match.exec(text);
    return ret;
}