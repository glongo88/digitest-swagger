(function(){function u(a,c,d){if(a===c)return 0!==a||1/a==1/c;if(null==a||null==c)return a===c;a._chain&&(a=a._wrapped);c._chain&&(c=c._wrapped);if(a.isEqual&&b.isFunction(a.isEqual))return a.isEqual(c);if(c.isEqual&&b.isFunction(c.isEqual))return c.isEqual(a);var e=n.call(a);if(e!=n.call(c))return!1;switch(e){case "[object String]":return a==""+c;case "[object Number]":return a!=+a?c!=+c:0==a?1/a==1/c:a==+c;case "[object Date]":case "[object Boolean]":return+a==+c;case "[object RegExp]":return a.source==
c.source&&a.global==c.global&&a.multiline==c.multiline&&a.ignoreCase==c.ignoreCase}if("object"!=typeof a||"object"!=typeof c)return!1;for(var f=d.length;f--;)if(d[f]==a)return!0;d.push(a);var f=0,g=!0;if("[object Array]"==e){if(f=a.length,g=f==c.length)for(;f--&&(g=f in a==f in c&&u(a[f],c[f],d)););}else{if("constructor"in a!="constructor"in c||a.constructor!=c.constructor)return!1;for(var h in a)if(b.has(a,h)&&(f++,!(g=b.has(c,h)&&u(a[h],c[h],d))))break;if(g){for(h in c)if(b.has(c,h)&&!f--)break;
g=!f}}d.pop();return g}var v=this,L=v._,r={},m=Array.prototype,s=Object.prototype,k=m.slice,M=m.unshift,n=s.toString,N=s.hasOwnProperty,B=m.forEach,C=m.map,D=m.reduce,E=m.reduceRight,F=m.filter,G=m.every,H=m.some,t=m.indexOf,I=m.lastIndexOf,s=Array.isArray,O=Object.keys,w=Function.prototype.bind,b=function(a){return new p(a)};"undefined"!==typeof exports?("undefined"!==typeof module&&module.exports&&(exports=module.exports=b),exports._=b):v._=b;b.VERSION="1.3.3";var l=b.each=b.forEach=function(a,
c,d){if(null!=a)if(B&&a.forEach===B)a.forEach(c,d);else if(a.length===+a.length)for(var e=0,f=a.length;e<f&&!(e in a&&c.call(d,a[e],e,a)===r);e++);else for(e in a)if(b.has(a,e)&&c.call(d,a[e],e,a)===r)break};b.map=b.collect=function(a,c,b){var e=[];if(null==a)return e;if(C&&a.map===C)return a.map(c,b);l(a,function(a,g,h){e[e.length]=c.call(b,a,g,h)});a.length===+a.length&&(e.length=a.length);return e};b.reduce=b.foldl=b.inject=function(a,c,d,e){var f=2<arguments.length;null==a&&(a=[]);if(D&&a.reduce===
D)return e&&(c=b.bind(c,e)),f?a.reduce(c,d):a.reduce(c);l(a,function(a,b,k){f?d=c.call(e,d,a,b,k):(d=a,f=!0)});if(!f)throw new TypeError("Reduce of empty array with no initial value");return d};b.reduceRight=b.foldr=function(a,c,d,e){var f=2<arguments.length;null==a&&(a=[]);if(E&&a.reduceRight===E)return e&&(c=b.bind(c,e)),f?a.reduceRight(c,d):a.reduceRight(c);var g=b.toArray(a).reverse();e&&!f&&(c=b.bind(c,e));return f?b.reduce(g,c,d,e):b.reduce(g,c)};b.find=b.detect=function(a,c,b){var e;J(a,function(a,
g,h){if(c.call(b,a,g,h))return e=a,!0});return e};b.filter=b.select=function(a,c,b){var e=[];if(null==a)return e;if(F&&a.filter===F)return a.filter(c,b);l(a,function(a,g,h){c.call(b,a,g,h)&&(e[e.length]=a)});return e};b.reject=function(a,c,b){var e=[];if(null==a)return e;l(a,function(a,g,h){c.call(b,a,g,h)||(e[e.length]=a)});return e};b.every=b.all=function(a,c,b){var e=!0;if(null==a)return e;if(G&&a.every===G)return a.every(c,b);l(a,function(a,g,h){if(!(e=e&&c.call(b,a,g,h)))return r});return!!e};
var J=b.some=b.any=function(a,c,d){c||(c=b.identity);var e=!1;if(null==a)return e;if(H&&a.some===H)return a.some(c,d);l(a,function(a,b,h){if(e||(e=c.call(d,a,b,h)))return r});return!!e};b.include=b.contains=function(a,c){var b=!1;return null==a?b:t&&a.indexOf===t?-1!=a.indexOf(c):b=J(a,function(a){return a===c})};b.invoke=function(a,c){var d=k.call(arguments,2);return b.map(a,function(a){return(b.isFunction(c)?c||a:a[c]).apply(a,d)})};b.pluck=function(a,c){return b.map(a,function(a){return a[c]})};
b.max=function(a,c,d){if(!c&&b.isArray(a)&&a[0]===+a[0])return Math.max.apply(Math,a);if(!c&&b.isEmpty(a))return-Infinity;var e={computed:-Infinity};l(a,function(a,b,h){b=c?c.call(d,a,b,h):a;b>=e.computed&&(e={value:a,computed:b})});return e.value};b.min=function(a,c,d){if(!c&&b.isArray(a)&&a[0]===+a[0])return Math.min.apply(Math,a);if(!c&&b.isEmpty(a))return Infinity;var e={computed:Infinity};l(a,function(a,b,h){b=c?c.call(d,a,b,h):a;b<e.computed&&(e={value:a,computed:b})});return e.value};b.shuffle=
function(a){var b=[],d;l(a,function(a,f){d=Math.floor(Math.random()*(f+1));b[f]=b[d];b[d]=a});return b};b.sortBy=function(a,c,d){var e=b.isFunction(c)?c:function(a){return a[c]};return b.pluck(b.map(a,function(a,b,c){return{value:a,criteria:e.call(d,a,b,c)}}).sort(function(a,b){var c=a.criteria,d=b.criteria;return void 0===c?1:void 0===d?-1:c<d?-1:c>d?1:0}),"value")};b.groupBy=function(a,c){var d={},e=b.isFunction(c)?c:function(a){return a[c]};l(a,function(a,b){var c=e(a,b);(d[c]||(d[c]=[])).push(a)});
return d};b.sortedIndex=function(a,c,d){d||(d=b.identity);for(var e=0,f=a.length;e<f;){var g=e+f>>1;d(a[g])<d(c)?e=g+1:f=g}return e};b.toArray=function(a){return a?b.isArray(a)||b.isArguments(a)?k.call(a):a.toArray&&b.isFunction(a.toArray)?a.toArray():b.values(a):[]};b.size=function(a){return b.isArray(a)?a.length:b.keys(a).length};b.first=b.head=b.take=function(a,b,d){return null==b||d?a[0]:k.call(a,0,b)};b.initial=function(a,b,d){return k.call(a,0,a.length-(null==b||d?1:b))};b.last=function(a,b,
d){return null==b||d?a[a.length-1]:k.call(a,Math.max(a.length-b,0))};b.rest=b.tail=function(a,b,d){return k.call(a,null==b||d?1:b)};b.compact=function(a){return b.filter(a,function(a){return!!a})};b.flatten=function(a,c){return b.reduce(a,function(a,e){if(b.isArray(e))return a.concat(c?e:b.flatten(e));a[a.length]=e;return a},[])};b.without=function(a){return b.difference(a,k.call(arguments,1))};b.uniq=b.unique=function(a,c,d){d=d?b.map(a,d):a;var e=[];3>a.length&&(c=!0);b.reduce(d,function(d,g,h){(c?
b.last(d)===g&&d.length:b.include(d,g))||(d.push(g),e.push(a[h]));return d},[]);return e};b.union=function(){return b.uniq(b.flatten(arguments,!0))};b.intersection=b.intersect=function(a){var c=k.call(arguments,1);return b.filter(b.uniq(a),function(a){return b.every(c,function(c){return 0<=b.indexOf(c,a)})})};b.difference=function(a){var c=b.flatten(k.call(arguments,1),!0);return b.filter(a,function(a){return!b.include(c,a)})};b.zip=function(){for(var a=k.call(arguments),c=b.max(b.pluck(a,"length")),
d=Array(c),e=0;e<c;e++)d[e]=b.pluck(a,""+e);return d};b.indexOf=function(a,c,d){if(null==a)return-1;var e;if(d)return d=b.sortedIndex(a,c),a[d]===c?d:-1;if(t&&a.indexOf===t)return a.indexOf(c);d=0;for(e=a.length;d<e;d++)if(d in a&&a[d]===c)return d;return-1};b.lastIndexOf=function(a,b){if(null==a)return-1;if(I&&a.lastIndexOf===I)return a.lastIndexOf(b);for(var d=a.length;d--;)if(d in a&&a[d]===b)return d;return-1};b.range=function(a,b,d){1>=arguments.length&&(b=a||0,a=0);d=arguments[2]||1;for(var e=
Math.max(Math.ceil((b-a)/d),0),f=0,g=Array(e);f<e;)g[f++]=a,a+=d;return g};var K=function(){};b.bind=function(a,c){var d,e;if(a.bind===w&&w)return w.apply(a,k.call(arguments,1));if(!b.isFunction(a))throw new TypeError;e=k.call(arguments,2);return d=function(){if(!(this instanceof d))return a.apply(c,e.concat(k.call(arguments)));K.prototype=a.prototype;var b=new K,g=a.apply(b,e.concat(k.call(arguments)));return Object(g)===g?g:b}};b.bindAll=function(a){var c=k.call(arguments,1);0==c.length&&(c=b.functions(a));
l(c,function(c){a[c]=b.bind(a[c],a)});return a};b.memoize=function(a,c){var d={};c||(c=b.identity);return function(){var e=c.apply(this,arguments);return b.has(d,e)?d[e]:d[e]=a.apply(this,arguments)}};b.delay=function(a,b){var d=k.call(arguments,2);return setTimeout(function(){return a.apply(null,d)},b)};b.defer=function(a){return b.delay.apply(b,[a,1].concat(k.call(arguments,1)))};b.throttle=function(a,c){var d,e,f,g,h,k,l=b.debounce(function(){h=g=!1},c);return function(){d=this;e=arguments;f||
(f=setTimeout(function(){f=null;h&&a.apply(d,e);l()},c));g?h=!0:k=a.apply(d,e);l();g=!0;return k}};b.debounce=function(a,b,d){var e;return function(){var f=this,g=arguments;d&&!e&&a.apply(f,g);clearTimeout(e);e=setTimeout(function(){e=null;d||a.apply(f,g)},b)}};b.once=function(a){var b=!1,d;return function(){if(b)return d;b=!0;return d=a.apply(this,arguments)}};b.wrap=function(a,b){return function(){var d=[a].concat(k.call(arguments,0));return b.apply(this,d)}};b.compose=function(){var a=arguments;
return function(){for(var b=arguments,d=a.length-1;0<=d;d--)b=[a[d].apply(this,b)];return b[0]}};b.after=function(a,b){return 0>=a?b():function(){if(1>--a)return b.apply(this,arguments)}};b.keys=O||function(a){if(a!==Object(a))throw new TypeError("Invalid object");var c=[],d;for(d in a)b.has(a,d)&&(c[c.length]=d);return c};b.values=function(a){return b.map(a,b.identity)};b.functions=b.methods=function(a){var c=[],d;for(d in a)b.isFunction(a[d])&&c.push(d);return c.sort()};b.extend=function(a){l(k.call(arguments,
1),function(b){for(var d in b)a[d]=b[d]});return a};b.pick=function(a){var c={};l(b.flatten(k.call(arguments,1)),function(b){b in a&&(c[b]=a[b])});return c};b.defaults=function(a){l(k.call(arguments,1),function(b){for(var d in b)null==a[d]&&(a[d]=b[d])});return a};b.clone=function(a){return b.isObject(a)?b.isArray(a)?a.slice():b.extend({},a):a};b.tap=function(a,b){b(a);return a};b.isEqual=function(a,b){return u(a,b,[])};b.isEmpty=function(a){if(null==a)return!0;if(b.isArray(a)||b.isString(a))return 0===
a.length;for(var c in a)if(b.has(a,c))return!1;return!0};b.isElement=function(a){return!(!a||1!=a.nodeType)};b.isArray=s||function(a){return"[object Array]"==n.call(a)};b.isObject=function(a){return a===Object(a)};b.isArguments=function(a){return"[object Arguments]"==n.call(a)};b.isArguments(arguments)||(b.isArguments=function(a){return!(!a||!b.has(a,"callee"))});b.isFunction=function(a){return"[object Function]"==n.call(a)};b.isString=function(a){return"[object String]"==n.call(a)};b.isNumber=function(a){return"[object Number]"==
n.call(a)};b.isFinite=function(a){return b.isNumber(a)&&isFinite(a)};b.isNaN=function(a){return a!==a};b.isBoolean=function(a){return!0===a||!1===a||"[object Boolean]"==n.call(a)};b.isDate=function(a){return"[object Date]"==n.call(a)};b.isRegExp=function(a){return"[object RegExp]"==n.call(a)};b.isNull=function(a){return null===a};b.isUndefined=function(a){return void 0===a};b.has=function(a,b){return N.call(a,b)};b.noConflict=function(){v._=L;return this};b.identity=function(a){return a};b.times=
function(a,b,d){for(var e=0;e<a;e++)b.call(d,e)};b.escape=function(a){return(""+a).replace(/&/g,"&amp;").replace(/</g,"&lt;").replace(/>/g,"&gt;").replace(/"/g,"&quot;").replace(/'/g,"&#x27;").replace(/\//g,"&#x2F;")};b.result=function(a,c){if(null==a)return null;var d=a[c];return b.isFunction(d)?d.call(a):d};b.mixin=function(a){l(b.functions(a),function(c){P(c,b[c]=a[c])})};var Q=0;b.uniqueId=function(a){var b=Q++;return a?a+b:b};b.templateSettings={evaluate:/<%([\s\S]+?)%>/g,interpolate:/<%=([\s\S]+?)%>/g,
escape:/<%-([\s\S]+?)%>/g};var x=/.^/,q={"\\":"\\","'":"'",r:"\r",n:"\n",t:"\t",u2028:"\u2028",u2029:"\u2029"},y;for(y in q)q[q[y]]=y;var R=/\\|'|\r|\n|\t|\u2028|\u2029/g,S=/\\(\\|'|r|n|t|u2028|u2029)/g,z=function(a){return a.replace(S,function(a,b){return q[b]})};b.template=function(a,c,d){d=b.defaults(d||{},b.templateSettings);a="__p+='"+a.replace(R,function(a){return"\\"+q[a]}).replace(d.escape||x,function(a,b){return"'+\n_.escape("+z(b)+")+\n'"}).replace(d.interpolate||x,function(a,b){return"'+\n("+
z(b)+")+\n'"}).replace(d.evaluate||x,function(a,b){return"';\n"+z(b)+"\n;__p+='"})+"';\n";d.variable||(a="with(obj||{}){\n"+a+"}\n");a="var __p='';var print=function(){__p+=Array.prototype.join.call(arguments, '')};\n"+a+"return __p;\n";var e=new Function(d.variable||"obj","_",a);if(c)return e(c,b);c=function(a){return e.call(this,a,b)};c.source="function("+(d.variable||"obj")+"){\n"+a+"}";return c};b.chain=function(a){return b(a).chain()};var p=function(a){this._wrapped=a};b.prototype=p.prototype;
var A=function(a,c){return c?b(a).chain():a},P=function(a,c){p.prototype[a]=function(){var a=k.call(arguments);M.call(a,this._wrapped);return A(c.apply(b,a),this._chain)}};b.mixin(b);l("pop push reverse shift sort splice unshift".split(" "),function(a){var b=m[a];p.prototype[a]=function(){var d=this._wrapped;b.apply(d,arguments);var e=d.length;"shift"!=a&&"splice"!=a||0!==e||delete d[0];return A(d,this._chain)}});l(["concat","join","slice"],function(a){var b=m[a];p.prototype[a]=function(){return A(b.apply(this._wrapped,
arguments),this._chain)}});p.prototype.chain=function(){this._chain=!0;return this};p.prototype.value=function(){return this._wrapped}}).call(this);