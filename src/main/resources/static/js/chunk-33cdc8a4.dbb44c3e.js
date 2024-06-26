(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-33cdc8a4"],{"206d":function(t,e,n){"use strict";n("3203")},3203:function(t,e,n){},"55a3":function(t,e,n){},"56a3":function(t,e,n){"use strict";n("55a3")},a55b:function(t,e,n){"use strict";n.r(e);var s=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"login-container"},[n("el-form",{ref:"loginForm",staticClass:"login-form",attrs:{model:t.loginForm,rules:t.loginRules,autocomplete:"on","label-position":"left"}},[n("div",{staticClass:"title-container"},[n("h3",{staticClass:"title"},[t._v(t._s(t.$t("login.title")))])]),n("el-form-item",{attrs:{prop:"username"}},[n("span",{staticClass:"svg-container"},[n("i",{staticClass:"el-icon-message"})]),n("el-input",{ref:"username",attrs:{placeholder:t.$t("login.name"),name:"username",type:"text",tabindex:"1",autocomplete:"on"},model:{value:t.loginForm.username,callback:function(e){t.$set(t.loginForm,"username",e)},expression:"loginForm.username"}})],1),n("el-tooltip",{attrs:{content:"Caps lock is On",placement:"right",manual:""},model:{value:t.capsTooltip,callback:function(e){t.capsTooltip=e},expression:"capsTooltip"}},[n("el-form-item",{attrs:{prop:"password"}},[n("span",{staticClass:"svg-container"},[n("svg-icon",{attrs:{"icon-class":"password"}})],1),n("el-input",{key:t.passwordType,ref:"password",attrs:{type:t.passwordType,placeholder:t.$t("login.pass"),name:"password",tabindex:"2",autocomplete:"on"},on:{blur:function(e){t.capsTooltip=!1}},nativeOn:{keyup:[function(e){return t.checkCapslock.apply(null,arguments)},function(e){return!e.type.indexOf("key")&&t._k(e.keyCode,"enter",13,e.key,"Enter")?null:t.handleLogin.apply(null,arguments)}]},model:{value:t.loginForm.password,callback:function(e){t.$set(t.loginForm,"password",e)},expression:"loginForm.password"}}),n("span",{staticClass:"show-pwd",on:{click:t.showPwd}},[n("svg-icon",{attrs:{"icon-class":"password"===t.passwordType?"eye":"eye-open"}})],1),n("el-link",{staticClass:"forgotPassword",attrs:{target:"_blank"},nativeOn:{click:function(e){return e.preventDefault(),t.handleForgotPassword.apply(null,arguments)}}},[t._v(t._s(t.$t("login.forgotPassword")))])],1)],1),n("el-button",{staticStyle:{width:"100%",margin:"10px 0"},attrs:{loading:t.loading,type:"primary"},nativeOn:{click:function(e){return e.preventDefault(),t.handleLogin.apply(null,arguments)}}},[t._v(t._s(t.$t("login.login")))])],1),n("div",{staticClass:"register-container"},[n("span",{staticClass:"title"},[t._v(t._s(t.$t("register.title"))),n("el-link",{attrs:{type:"primary"},nativeOn:{click:function(e){return e.preventDefault(),t.handleRegister.apply(null,arguments)}}},[t._v(t._s(t.$t("register.toRegister")))])],1)]),n("div",{staticClass:"adminLogin-container"},[n("span",{staticClass:"title"},[t._v(t._s(t.$t("adminlogin.loginTitle"))),n("el-link",{attrs:{type:"primary"},nativeOn:{click:function(e){return e.preventDefault(),t.handleAdminLogin.apply(null,arguments)}}},[t._v(t._s(t.$t("adminlogin.toAdminLogin")))])],1)])],1)},o=[],i=(n("b64b"),{name:"Login",data:function(){var t=this,e=function(e,n,s){n.length<6?s(new Error(t.$t("login.validatePassword"))):s()};return{loginForm:{username:"",password:""},loginRules:{password:[{required:!0,trigger:"blur",validator:e}]},passwordType:"password",capsTooltip:!1,loading:!1,showDialog:!1,redirect:void 0,otherQuery:{}}},watch:{$route:{handler:function(t){var e=t.query;e&&(this.redirect=e.redirect,this.otherQuery=this.getOtherQuery(e))},immediate:!0}},created:function(){},mounted:function(){""===this.loginForm.username?this.$refs.username.focus():""===this.loginForm.password&&this.$refs.password.focus()},destroyed:function(){},methods:{checkCapslock:function(t){var e=t.key;this.capsTooltip=e&&1===e.length&&e>="A"&&e<="Z"},showPwd:function(){var t=this;"password"===this.passwordType?this.passwordType="":this.passwordType="password",this.$nextTick((function(){t.$refs.password.focus()}))},handleLogin:function(){var t=this;this.$refs.loginForm.validate((function(e){if(!e)return console.log("error submit!!"),!1;t.loading=!0,t.$store.dispatch("user/login",t.loginForm).then((function(){t.$router.push({path:t.redirect||"/",query:t.otherQuery}),t.loading=!1})).catch((function(){t.loading=!1}))}))},handleRegister:function(){this.$router.push({path:"/register"})},handleAdminLogin:function(){this.$router.push({path:"/adminLogin"})},handleForgotPassword:function(){this.$router.push({path:"/forgotPassword"})},getOtherQuery:function(t){return Object.keys(t).reduce((function(e,n){return"redirect"!==n&&(e[n]=t[n]),e}),{})}}}),r=i,a=(n("206d"),n("56a3"),n("2877")),l=Object(a["a"])(r,s,o,!1,null,"72af5ec4",null);e["default"]=l.exports}}]);