(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-6c89dfb3"],{6292:function(o,e,n){"use strict";n.r(e);var t=function(){var o=this,e=o.$createElement,n=o._self._c||e;return n("div",{staticClass:"report-download-container"},[o._m(0),n("div",{staticClass:"report-form-container"},[n("el-form",{ref:"form",attrs:{model:o.form}},[n("el-form-item",[n("el-input",{attrs:{placeholder:"请输入您的手机号"},model:{value:o.form.phone,callback:function(e){o.$set(o.form,"phone",e)},expression:"form.phone"}})],1),n("el-form-item",[n("el-input",{attrs:{placeholder:"请输入您的姓名"},model:{value:o.form.name,callback:function(e){o.$set(o.form,"name",e)},expression:"form.name"}})],1),n("el-form-item",[n("el-input",{attrs:{placeholder:"请输入您的报告码"},model:{value:o.form.code,callback:function(e){o.$set(o.form,"code",e)},expression:"form.code"}})],1),n("el-form-item",[n("el-button",{staticClass:"report-form-button",attrs:{type:"success",round:"",loading:o.isLoading},on:{click:o.handleDownload}},[o._v("下载报告")])],1)],1)],1)])},a=[function(){var o=this,e=o.$createElement,t=o._self._c||e;return t("div",{staticClass:"title-container"},[t("div",{staticClass:"logo"},[t("img",{attrs:{src:n("a4bc"),alt:""}})]),t("div",{staticClass:"title"},[o._v("星云生物报告下载")])])}],i=(n("b0c0"),n("bc3a")),s=n.n(i),r={name:"DownloadReport",components:{},data:function(){return{form:{phone:"",name:"",code:""},isLoading:!1}},mounted:function(){},methods:{warn1:function(){this.$message({message:"请您填写全部信息",type:"warning"})},warn2:function(){this.$message({message:"请检查您的信息是否填写正确",type:"warning"})},handleDownload:function(){var o=this;if(""!==this.form.phone&&""!==this.form.name&&""!==this.form.code){this.isLoading=!0;var e={phone:this.form.phone,name:this.form.name,code:this.form.code};s.a.get("http://localhost:8081/variation/downloadFile",{params:e}).then((function(e){200===e.status?(window.open("http://localhost:8081/variation/downloadFile?phone="+o.form.phone+"&name="+o.form.name+"&code="+o.form.code,"_blank"),o.isLoading=!1):(o.isLoading=!1,o.warn2())})).catch((function(e){o.isLoading=!1,o.warn2(),console.log(e)}))}else this.warn1()}}},c=r,l=(n("8798"),n("2877")),m=Object(l["a"])(c,t,a,!1,null,"74268b64",null);e["default"]=m.exports},"741b":function(o,e,n){},8798:function(o,e,n){"use strict";n("741b")},a4bc:function(o,e,n){o.exports=n.p+"img/logo_nebula.28425df8.png"}}]);