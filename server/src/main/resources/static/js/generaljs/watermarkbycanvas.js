function addWaterMarker(){


    var can = document.createElement('canvas');
    var body = document.body;

    body.appendChild(can);

    can.width=200;
    can.height=200;
    can.style.display='none';


    var cans = can.getContext('2d');
    cans.rotate(-20*Math.PI/180);
    cans.font = "16px Microsoft JhengHei";
    cans.fillStyle = "rgba(17, 17, 17, 0.50)";
    cans.textAlign = 'left';
    cans.textBaseline = 'Middle';
    cans.fillText('检测中心LIMS',can.width/3,can.height/2);

    body.style.backgroundImage="url("+can.toDataURL("image/png")+")";

}