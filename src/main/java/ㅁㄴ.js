{
    name:'os', index
:
    'os', width
:
    90 , sorttype
:

    function (cell, obj) {

        return obj.hwosname + "(" + obj.hwosversion + ")";
    }

,
    align:"center", editable
:
    false , formatter
:

    function (cellV, op, rowObj) {
        if (rowObj.hwosname == undefined || rowObj.hwosversion == undefined)
            return "<input type='text' height='48' style='height:18px' data-seq = '" + rowObj.asset_seq + "' data-gubun='hwosname' value='" + hwosname + "' onclick='PG.fn.searchOSOpen(event)' readOnly />"
        else
            return rowObj.hwosname + "(" + rowObj.hwosversion + ")";
    }
}
,


{
    name:'domainnm' , index
:
    'domainnm', width
:
    90 , sortype
:
    'text' , align
:
    "left", editable
:
    false , formatter
:

    function (cellV, op, rowObj) {
        var domainname = rowObj.domainname == undefined ? "" : rowObj.domainname;
        return "<input type='text' height='48' style='height:18px' data-seq = '" + rowObj.asset_seq + "' data-gubun='domainname' value='" + domainname + "' onclick='PG.fn.searchDomainOpen(event)' readOnly />"
    }
}
,
{
    name:'fir' , index
:
    'fir', width
:
    90 , sortype
:
    'text' , align
:
    "left", editable
:
    false, formatter
:

    function (cellV, op, rowObj) {
        var mngempnofirname = rowObj.mngempnofirname == undefined ? "" : rowObj.mngempnofirname;
        //mngempnofirname = mngempnofirname == undefined ? "" : mngempnofirname;
        return "<input type='text' height='48' style='height:18px' data-seq = '" + rowObj.asset_seq + "' data-gubun='mngempnofir' value='" + mngempnofirname + "' onclick='PG.fn.searchUserOpen(event)' readOnly />"
    }
}
,
{
    name:'sec', index
:
    'sec', width
:
    90 , sortype
:
    'text' , align
:
    "left", editable
:
    false, formatter
:

    function (cellV, op, rowObj) {
        var mngempnosecname = rowObj.mngempnosecname == undefined ? "" : rowObj.mngempnosecname;
        return "<input type='text' height='48' style='height:18px' data-seq = '" + rowObj.asset_seq + "' data-gubun='mngempnosec' value='" + mngempnosecname + "'  onclick='PG.fn.searchUserOpen(event)'  readOnly/>"
    }
}
,



<
div
id = "searchOSDialog"
title = '<s:text name="AGENT.AGENT_REGISTRY.LABEL.SEARCH_OS"/>' >
    < div
id = "searchOSDialog_Wrap" >
    //새로 작성이 필요
    //     <div id="searchOSFind">
    //     <input type="text" id="searchOSListFilterText" name="searchOSListFilterText" onkeydown="if(event.keyCode == 13){ PG.fn.searchOSListFilter();}"/>
    //     <span class="button s_white" id=""><a href="javascript:PG.fn.searchOSListFilter()"><s:text name="AGENT.AGENT_DETAIL.LABEL.SEARCH"/></a></span>
    // </div>
    // <div class="margintop_5"></div>
    //     <div id="searchOSList_wrap">
    //     <table id='searchOSList'><tr><td></td></tr></table>
    // </div>
    < /div>
    < /div>

E:\
workspace_NEW\workspace_190516\SecuMS_branch\src\main\webapp\WEB - INF\pages\server\system\hwsystemDetail.jsp
< th > OS < /th>
< tD
id = "hwgorup_wrap" >

    < /tD>
    < td
id = "hwmaster_seq_wrap" >
    < /td>


PG.fn.hwgroupInit = function hwgroupInit(val) {
    var list = {"list": PG.data.hwgroup};

    var source = $("#hwgroup_temp").html();
    var template = Handlebars.compile(source);
    var html = template(list);
    var $hwgorup_wrap = $("#hwgorup_wrap");
    var $html = $(html);
    $html.find("[value=" + val + "]").attr("selected", "selected");
    $hwgorup_wrap.empty();
    $hwgorup_wrap.append($html);
    PG.fn.hwmasterChg(val);
};

PG.fn.hwmasterChg = function hwmasterChg(val) {
    var hwmaster_seq = PG.data.hwmaster_seq;
    var rawList = PG.data.hwmaster;
    var listed = [];
    for (var i = 0, MAX = rawList.length; i < MAX; i++) {
        if (rawList[i].hwgroup == val) {
            listed.push(rawList[i]);
        }
    }

    var list = {"list": listed};
    var source = $("#hwmaster_temp").html();
    var template = Handlebars.compile(source);
    var html = template(list);
    var $html = $(html);
    var $hwmaster_seq_wrap = $("#hwmaster_seq_wrap");
    $html.find("[value=" + hwmaster_seq + "]").attr("checked", "checked");
    $hwmaster_seq_wrap.empty();
    $hwmaster_seq_wrap.append($html);

};


List
hwgroup = ssmHwDao.ssmCodeList(map);
List
hwmasterList = ssmHwDao.ssmhwmasterList(map);


<
table
width = "100%"
class
= "sm-table-search" >
    < colgroup >
    < col
width = "20" / >
    < col
width = "20" / >
    < col
width = "50" / >
    < /colgroup>
    < tbody >
    < tr >
    < th > OS < /th>
    < tD
id = "hwgorup_wrap" > < /tD>
    < td
id = "hwmaster_seq_wrap" > < /td>
    < /tr>
    < /tbody>
    < /table>


    < select
name = "POL_MNGT_SEQ"
id = "POL_MNGT_SEQ" >
    < c
:
forEach
var =
"list"
items = "${listPolicyMasterList}" >
    < option
value = "${list.POL_MNGT_SEQ}"
    < c
:
if test = "${list.REP_YN eq 'Y'}" > selected < /c:if>>${list.POL_MNGT_NM}</option >
< /c:forEach>
< /select>

1612


< tbody >
< tr >
< th > OS < /th>
< td
id = "hwgorup_wrap" >
    < select
id = "hwgroup"
name = "hwgroup"
onchange = "PG.fn.hwmasterChg(this.value)"
style = "width:200px" >

    < /select>
    < % -- < select > -- % >
    < % -- < option
value = "" > 시스템그룹
선택 < /option>--%>
< % -- < option
value = "02" > Unix < /option>--%>
    < % -- < option
value = "01" > Windows < /option>--%>
    < % -- < option
value = "05" > Linux < /option>--%>
    < % -- < option
value = "06" > Windows - PC < /option>--%>
    < % -- < /select>--%>
    < /td>
    < /tr>
    < tr >
    < td
id = "hwmaster_seq_wrap" > < /td>
    < /tr>6


var radioB = $("<label>" +
    "<"
input
type = 'radio'
id = '" + PG.data.hwmaster[count].hwgroup + "'
name = '" + PG.data.hwmaster[count].hwgroup + "' / >
    PG.data.hwmaster[count].hwmastername + " - " + PG.data.hwmaster[count].hwosversion +
    < /label>
    < /br>");


systemAccept