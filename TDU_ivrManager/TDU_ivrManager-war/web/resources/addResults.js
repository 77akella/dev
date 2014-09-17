function getnbest( item, nbest ) {var len = application.lastresult$.length;var result = "";if ( len > nbest) {len = nbest;}for (var i = 0; i < len; i++) {if (i > 0) {result += " |";}var temp = "application.lastresult$[" + i + "]." + item;result += extractprops( "", eval(temp));}return result;}function getnbestnmni( item, nbest ) {var len = application.lastresult$.length;var result = "";if ( len > nbest) {len = nbest;}for (var i = 0; i < len; i++) {if (i > 0) {result += " |";}result += item;}return result;}function extractprops ( parent, obj ) {var prop, name, result = "";var count = 1;if ( typeof ( obj ) == "object" ) {for ( prop in obj ) {name = parent + prop;if ( typeof ( obj [ prop ] ) == "object" ) {result += extractprops( name+".", obj [ prop ] );} else {if (count == 1) {result = obj [ prop ];} else {result += " " + obj [ prop ];}}count = count + 1;}} else {if (obj == undefined ) {result += "undefined";} else {result += obj;}}return result;}function startswith ( value, startwith ) {var index;index = value.indexOf(startwith, 0);if ( index == 0 ) {return true;} else {return false;}}function containsUndefined ( value ) {var index;index = value.indexOf('undefined', 0);if ( index == -1 ) {return false;} else {return true;}}function objectToString( obj ) {try {var result = "";result += getobjectprops( "", obj);if (result.charAt(0) == '|' ) {result = result.substring(1);}} catch (errMsg) {return("undefined");}return result;}function getobjectprops ( parent, obj ) {var prop, name, result = "";if ( typeof ( obj ) == "object" ) {for ( prop in obj ) {name = parent + prop;if ( typeof ( obj [ prop ] ) == "object" ) {result += extractprops( name+".", obj [ prop ] );} else {result += "|" + obj [ prop ];}}} else {if (obj == undefined ) {result += "undefined";} else {result += obj;}}return result;}function getArray( arrayName, item ) {try {var len = eval( arrayName +'.length;');var result = "";for (var i = 0; i < len; i++) {if (i > 0) {result += " |";}var temp = arrayName + "[" + i + "]." + item;result += eval(temp);}return result;} catch (errMsg) {return('unknown');}}function getRedirect( item ) {return(getArray('session.connection.redirect', item));}function getShareduui( item ) {return(getArray('session.avaya.uui.shared', item));}function getSIPCallID() {try {var protocol = getScriptItem( 'session.connection.protocol.name' );if ( protocol == 'sip' || protocol == 'SIP' ) {var temp = getScriptItem( 'session.connection.protocol.sip.callid' );return(temp);} else {return('unknown');}} catch (errMsg) {return('unknown');}}
function getScriptItem( item ) {try {var result = "";result += eval(item);if(result=="unknown"||result=="undefined"){result="";}return result;} catch (errMsg) {return('');}}

function GetData(d, t)  {
    return (d.getElementsByTagName(t).item(0).firstChild.data);
}
var results=new Array();
var startTime=(new Date()).getTime();
var stepCount=0;
var changeValTime=0;
var noinputcount=0;
var nomatchcount=0;
function addResult1(varId, resultVal){
    var prevResult=getResultCount( varId );
    var result={stepCount : stepCount , varId:varId , resultVal:resultVal , timeFromStart : ((new Date).getTime()-startTime) , changeValTime : changeValTime , resultCount:prevResult.count , resultTime:prevResult.time};
    results.push( result );
    return result;
}
function getResultCount(varId){
   var result={count:1 , time: undefined};
   for ( var i=0 ; i < results.length ; i++ ) {
      if(results[i].varId==varId){
         result.count++;
         result.time=(new Date()).getTime() - results[i].timeFromStart - startTime;
      }
   }
   return result;
}
function addResultArray(varVal){
      stepCount++;
      changeValTime=(new Date()).getTime() - changeValTime - startTime;
      for (var i=0; i < varVal.length ;i++ ) {
         addResult1(varVal[i].varId , varVal[i].value);
      }
      resetCounters();
}
function addResult(varId, value){
    stepCount++;
    changeValTime=(new Date()).getTime() - changeValTime - startTime;
    return addResult1(varId,value);
    resetCounters();
}

function resetCounters(){
    noinputcount=0;
    nomatchcount=0;
}

function getResults(){
    return results;
}