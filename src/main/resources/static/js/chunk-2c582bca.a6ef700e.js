(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2c582bca"],{"0bdf":function(e,r,t){},"3b14":function(e,r,t){"use strict";t("0bdf")},"73cf":function(e,r,t){"use strict";t.r(r);var s=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",{staticClass:"register-container"},[t("el-form",{ref:"registerForm",staticClass:"register-form",attrs:{model:e.registerForm,rules:e.registerRules,autocomplete:"on","label-position":"left"}},[t("div",{staticClass:"title-container"},[t("h3",{staticClass:"title"},[e._v(e._s(e.$t("register.toRegister")))])]),t("el-form-item",{attrs:{prop:"username"}},[t("span",{staticClass:"svg-container"},[t("svg-icon",{attrs:{"icon-class":"user"}})],1),t("el-input",{ref:"username",attrs:{placeholder:e.$t("register.username"),name:"username",type:"text",autocomplete:"off"},model:{value:e.registerForm.username,callback:function(r){e.$set(e.registerForm,"username",r)},expression:"registerForm.username"}})],1),t("el-form-item",{attrs:{prop:"email"}},[t("span",{staticClass:"svg-container"},[t("i",{staticClass:"el-icon-message"})]),t("el-input",{ref:"email",attrs:{placeholder:e.$t("register.email"),name:"email",type:"text",autocomplete:"off"},model:{value:e.registerForm.email,callback:function(r){e.$set(e.registerForm,"email",r)},expression:"registerForm.email"}})],1),t("el-form-item",{attrs:{prop:"password"}},[t("span",{staticClass:"svg-container"},[t("i",{staticClass:"el-icon-key"})]),t("el-input",{ref:"password",attrs:{placeholder:e.$t("register.password"),name:"password",type:"password",autocomplete:"off"},model:{value:e.registerForm.password,callback:function(r){e.$set(e.registerForm,"password",r)},expression:"registerForm.password"}})],1),t("el-form-item",{attrs:{prop:"checkPass"}},[t("span",{staticClass:"svg-container"},[t("i",{staticClass:"el-icon-key"})]),t("el-input",{ref:"checkPass",attrs:{placeholder:e.$t("register.checkPass"),name:"checkPass",type:"password",autocomplete:"off"},model:{value:e.registerForm.checkPass,callback:function(r){e.$set(e.registerForm,"checkPass",r)},expression:"registerForm.checkPass"}})],1),t("el-form-item",{attrs:{prop:"principalType"}},[t("span",{staticClass:"svg-container"},[t("i",{staticClass:"el-icon-office-building"})]),t("el-input",{ref:"principalType",attrs:{placeholder:e.$t("register.principalType"),name:"principalType",type:"text"},model:{value:e.registerForm.principalType,callback:function(r){e.$set(e.registerForm,"principalType",r)},expression:"registerForm.principalType"}})],1),t("el-form-item",{attrs:{prop:"applicationPurpose"}},[t("span",{staticClass:"svg-container"},[t("i",{staticClass:"el-icon-edit"})]),t("el-input",{ref:"applicationPurpose",attrs:{placeholder:e.$t("register.applicationPurpose"),name:"applicationPurpose",type:"text"},model:{value:e.registerForm.applicationPurpose,callback:function(r){e.$set(e.registerForm,"applicationPurpose",r)},expression:"registerForm.applicationPurpose"}})],1),t("el-form-item",{attrs:{prop:"emailCode"}},[t("span",{staticClass:"svg-container"},[t("i",{staticClass:"el-icon-chat-line-round"})]),t("el-input",{ref:"emailCode",staticClass:"sendCodeInput",attrs:{maxlength:"6",placeholder:e.$t("register.emailCode"),name:"emailCode",type:"text"},model:{value:e.registerForm.emailCode,callback:function(r){e.$set(e.registerForm,"emailCode",r)},expression:"registerForm.emailCode"}}),t("el-button",{staticClass:"sendCodeBtn",attrs:{type:"primary",disabled:e.SendCodeDisabled,plain:""},nativeOn:{click:function(r){return r.preventDefault(),e.handleSendCode.apply(null,arguments)}}},[e._v(e._s(this.sendCodeBtnContent))])],1),t("el-button",{staticStyle:{width:"100%","margin-bottom":"10px"},attrs:{loading:e.loading,type:"primary"},nativeOn:{click:function(r){return r.preventDefault(),e.handleRegister.apply(null,arguments)}}},[e._v(e._s(e.$t("register.toRegister")))])],1),t("div",{staticClass:"login-container"},[t("span",{staticClass:"title"},[e._v(e._s(e.$t("register.loginTitle"))),t("el-link",{attrs:{type:"primary"},nativeOn:{click:function(r){return r.preventDefault(),e.handleLogin.apply(null,arguments)}}},[e._v(e._s(e.$t("register.toLogin")))])],1)])],1)},a=[],i=t("c24f"),n={name:"register",data:function(){var e=this,r=function(r,t,s){if(t.length<6||t.length>20)return s(e.$t("register.validateUsername"));s()},t=function(r,t,s){var a=/^\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;a.test(t)?s():s(new Error(e.$t("register.validateEmail")))},s=function(r,t,s){var a=/(^\d{18}$)|(^\d{17}(\d|X|x)$)/;a.test(t)?s():s(new Error(e.$t("register.validateIDCardNo")))},a=function(r,t,s){""===t?s(new Error("请输入密码")):t.length<8?s(new Error("密码不得少于8位数")):(""!==e.registerForm.checkPass&&e.$refs.registerForm.validateField("checkPass"),s())},i=function(r,t,s){""===t?s(new Error("请再次输入密码")):t!==e.registerForm.password?s(new Error("两次输入密码不一致!")):s()};return{registerForm:{username:"",email:"",password:"",checkPass:"",principalType:"",applicationPurpose:"",IDCardName:"",IDCardNo:"",emailCode:""},registerRules:{username:[{required:!0,trigger:"blur",validator:r}],email:[{required:!0,trigger:"blur",validator:t}],password:[{required:!0,trigger:"blur",validator:a}],checkPass:[{required:!0,trigger:"blur",validator:i}],principalType:[{required:!0,trigger:"blur"}],applicationPurpose:[{required:!0,trigger:"blur"}],IDCardName:[{required:!0,trigger:"blur"}],IDCardNo:[{required:!0,trigger:"blur",validator:s}],emailCode:[{required:!0,trigger:"blur"}]},loading:!1,SendCodeDisabled:!1,sendCodeBtnContent:this.$t("register.sendCode")}},methods:{handleRegister:function(){var e=this;this.$refs.registerForm.validate((function(r){if(!r)return console.log("error submit!!"),!1;e.loading=!0,Object(i["g"])(e.registerForm).then((function(r){200===r.code?(e.registerForm={username:"",email:"",principalType:"",applicationPurpose:"",IDCardName:"",IDCardNo:""},e.$message({message:e.$t("register.successMessage"),type:"success"}),setTimeout((function(){e.$router.push("/login")}),2e3)):201===r.code?e.$message({message:e.$t("register.warnMessage"),type:"warning"}):202===r.code?e.$message({message:e.$t("register.usernameWarnMessage"),type:"warning"}):e.$message({message:e.$t("register.errorMessage"),type:"error"}),e.loading=!1})).catch((function(){e.loading=!1}))}))},handleLogin:function(){this.$router.push({path:"/login"})},handleSendCode:function(){var e=this,r=/^\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/,t=this;this.SendCodeDisabled=!0,r.test(this.registerForm.email)?Object(i["h"])({email:this.registerForm.email}).then((function(r){if(500===r.code)t.SendCodeDisabled=!1,e.$message({message:e.$t("register.sendCodeErrorMessage"),type:"error"});else if(201===r.code)t.SendCodeDisabled=!1,e.$message({message:e.$t("register.isReregistedMessage"),type:"error"});else{e.$message({message:e.$t("register.sendCodeSuccessMessage"),type:"success"});var s=60,a=setInterval((function(){s-=1,t.sendCodeBtnContent=s,0===s&&(clearInterval(a),t.SendCodeDisabled=!1,t.sendCodeBtnContent=t.$t("register.sendCode"))}),1e3)}})):t.SendCodeDisabled=!1}}},o=n,l=(t("a894"),t("3b14"),t("2877")),c=Object(l["a"])(o,s,a,!1,null,"e13e1c3a",null);r["default"]=c.exports},a894:function(e,r,t){"use strict";t("ee54")},ee54:function(e,r,t){}}]);