(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-0484f8fd"],{1619:function(e,t,o){"use strict";o("4de4");var a=o("2b0e");a["default"].filter("filterAmount",(function(e,t){return t||(t=20),e&&e.length>t&&(e=e.substring(0,t)+"..."),e}))},"1c61":function(e,t,o){},"795a":function(e,t,o){"use strict";o.r(t);var a=function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",[o("Nav"),o("el-main",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}]},[o("div",{staticClass:"main-container"},e._l(e.geneDetailData,(function(t,a,l){return o("div",{key:l,staticClass:"sub-content-1 clearfix"},[o("el-row",{staticClass:"grid-title",attrs:{gutter:0}},[o("el-col",{attrs:{span:24,offset:0}},[o("div",[e._v(e._s(t.uu_id))])])],1),e._l(t,(function(t,a,l){return o("div",{key:l,staticClass:"content"},[o("div",{staticClass:"div-striped"},[e._v(e._s(a)+"：")]),o("el-tooltip",{staticClass:"item",attrs:{disabled:!(t.length>50),effect:"dark",content:t,placement:"top-start"}},[o("div",[e._v(e._s(e._f("filterAmount")(t,50)))])])],1)}))],2)})),0)])],1)},l=[],i=o("9ce4"),r=o("ca75");o("1619");o("817d");var c={name:"Variation",components:{Nav:r["a"]},data:function(){return{geneDetailData:null,variantId:"",loading:!0}},watch:{},created:function(){var e=this;this.variantId=this.$route.query["id"];var t={variantId:this.variantId,chrom:"x"===this.$route.query["chrom"]?23:this.$route.query["chrom"]};Object(i["d"])(t).then((function(t){200===t.code&&(e.geneDetailData=t.listData,e.loading=!1)}))},methods:{}},n=c,s=(o("8291"),o("2877")),d=Object(s["a"])(n,a,l,!1,null,"3061add5",null);t["default"]=d.exports},"817d":function(e,t,o){var a,l,i;(function(r,c){l=[t,o("313e")],a=c,i="function"===typeof a?a.apply(t,l):a,void 0===i||(e.exports=i)})(0,(function(e,t){var o=function(e){"undefined"!==typeof console&&console&&console.error&&console.error(e)};if(t){var a=["#2ec7c9","#b6a2de","#5ab1ef","#ffb980","#d87a80","#8d98b3","#e5cf0d","#97b552","#95706d","#dc69aa","#07a2a4","#9a7fd1","#588dd5","#f5994e","#c05050","#59678c","#c9ab00","#7eb00a","#6f5553","#c14089"],l={color:a,title:{textStyle:{fontWeight:"normal",color:"#008acd"}},visualMap:{itemWidth:15,color:["#5ab1ef","#e0ffff"]},toolbox:{iconStyle:{normal:{borderColor:a[0]}}},tooltip:{backgroundColor:"rgba(50,50,50,0.5)",axisPointer:{type:"line",lineStyle:{color:"#008acd"},crossStyle:{color:"#008acd"},shadowStyle:{color:"rgba(200,200,200,0.2)"}}},dataZoom:{dataBackgroundColor:"#efefff",fillerColor:"rgba(182,162,222,0.2)",handleColor:"#008acd"},grid:{borderColor:"#eee"},categoryAxis:{axisLine:{lineStyle:{color:"#008acd"}},splitLine:{lineStyle:{color:["#eee"]}}},valueAxis:{axisLine:{lineStyle:{color:"#008acd"}},splitArea:{show:!0,areaStyle:{color:["rgba(250,250,250,0.1)","rgba(200,200,200,0.1)"]}},splitLine:{lineStyle:{color:["#eee"]}}},timeline:{lineStyle:{color:"#008acd"},controlStyle:{color:"#008acd",borderColor:"#008acd"},symbol:"emptyCircle",symbolSize:3},line:{smooth:!0,symbol:"emptyCircle",symbolSize:3},candlestick:{itemStyle:{color:"#d87a80",color0:"#2ec7c9"},lineStyle:{width:1,color:"#d87a80",color0:"#2ec7c9"},areaStyle:{color:"#2ec7c9",color0:"#b6a2de"}},scatter:{symbol:"circle",symbolSize:4},map:{itemStyle:{color:"#ddd"},areaStyle:{color:"#fe994e"},label:{color:"#d87a80"}},graph:{itemStyle:{color:"#d87a80"},linkStyle:{color:"#2ec7c9"}},gauge:{axisLine:{lineStyle:{color:[[.2,"#2ec7c9"],[.8,"#5ab1ef"],[1,"#d87a80"]],width:10}},axisTick:{splitNumber:10,length:15,lineStyle:{color:"auto"}},splitLine:{length:22,lineStyle:{color:"auto"}},pointer:{width:5}}};t.registerTheme("macarons",l)}else o("ECharts is not Loaded")}))},8291:function(e,t,o){"use strict";o("1c61")}}]);