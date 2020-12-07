<script>
  window.watsonAssistantChatOptions = {
      integrationID: "ecbdef81-50af-42bd-80a0-d69439631b47", // The ID of this integration.
      region: "us-south", // The region your integration is hosted in.
      serviceInstanceID: "5d4a831b-ced3-48b6-b45d-35f0ea957fc4", // The ID of your service instance.
      onLoad: function(instance) { instance.render(); }
    };
  setTimeout(function(){
    const t=document.createElement('script');
    t.src="https://web-chat.global.assistant.watson.appdomain.cloud/loadWatsonAssistantChat.js";
    document.head.appendChild(t);
  });
</script>