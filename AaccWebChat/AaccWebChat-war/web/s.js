
function processUpdatedMessages() {
    var data = $(PrimeFaces.escapeClientId('chatHistoryForm:unreadMessages')).html();
    data = convertToLinks(data);
    if (data.length != 0) {
        var chatContent = $(PrimeFaces.escapeClientId('chatHistoryForm:chatHistory'));
        chatContent.append(data);
        try{
            if($(PrimeFaces.escapeClientId('chatHistoryForm:unreadMessages')).find("div[class*='msg_chatMessageByCustomer']").length == 0) {
                playNotification();
            }
        }catch (e) {}
        $(PrimeFaces.escapeClientId('chatHistoryForm:public')).animate({scrollTop: $(PrimeFaces.escapeClientId('chatHistoryForm:chatWrapper')).height()}, 800);
        $(PrimeFaces.escapeClientId('chatHistoryForm:unreadMessages')).html('');
    }
}

function playNotification(){
    //HTML5 Audio is Supported
    if("Audio" in window)
    {
        var audio = $('#chatAudio')[0];//document.getElementByID('audio');
        audio.play();
    }
    //HTML5 Audio is NOT Supported
    else
    {
        document.getElementById("bgsound").src="notify.wav";
            //"<embed src=\"notify.wav\" hidden=\"true\" type=\"audio/x-wav\" autostart=\"true\" loop=\"false\" />";
    }
}

function convertToLinks(text) {
//URLs starting with http://, https://
    var replacePattern1 = /(\b(https?):\/\/[-A-Z0-9+&amp;@#\/%?=~_|!:,.;]*[-A-Z0-9+&amp;@#\/%=~_|])/ig;
    var replacedText = text.replace(replacePattern1, '<a class="msg_link" title="$1" href="$1" target="_blank">$1</a>');

//URLs starting with "www."
    var replacePattern2 = /(^|[^\/])(www\.[\S]+(\b|$))/gim;
    replacedText = replacedText.replace(replacePattern2, '$1<a class="msg_link" href="http://$2" target="_blank">$2</a>');

//returns the text result
    return replacedText;
}