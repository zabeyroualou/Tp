///////////////////////////////////// REQUESTER //////////////////////////////////
let tableRequester = new Tabulator("#requester-result", {
  ajaxURL: "/requester-json/result?titre="+titre,
  ajaxResponse:function(url, params, response){
    //Convertir en objet array
    let data = $.parseJSON(response);
    this.fields = data.fields;
    console.log(data);
    return data.records; //return the tableData property of a response json object
  },
  autoColumns:true, //create columns from data field names,
  autoColumnsDefinitions: function(defs) {
    defs.forEach(e => {
      this.fields.forEach(f => {
        if(e.field === f.name) {
          if((f.type === "NUMERIC" || f.type === "BIGINT") &&
             (f.name.includes("montant") || f.name.includes("prix") ||
              f.name.includes("debit") || f.name.includes("credit") ||
              f.name.includes("quantite"))) {
            e.formatter = "money";
            e.formatterParams = {
              decimal: "",
              thousand: " ",
              precision: 0,
            };
            e.hozAlign = "right";
            e.bottomCalc = "sum";
            e.bottomCalcFormatter = e.formatter;
            e.bottomCalcFormatterParams = e.formatterParams;
          }

          if(f.type === "TIMESTAMP") {
            e.formatter = function(cell, params, onRendered) {
              let date = cell.getValue();
              try {
                date = moment(cell.getValue()).format("DD/MM/YYYY");
              } catch (e) {
                date = '';
              }
              return date;
            };
          }
        }
      });
    });
    return defs;
  },
  layout:"fitDataStretch",
  pagination:"local",       //paginate the data
  paginationSize:100,         //allow 7 rows per page of data
  movableColumns:true,      //allow column order to be changed
  langs: {
    "default": {
      "pagination": {
        "first_title": "",
        "prev_title": "",
        "next_title": "",
        "last_title": "",
        "next": "Suiv.",
        "prev": "Préc.",
        "first": '<i class="fa fa-angle-double-left"></i>',
        "last": '<i class="fa fa-angle-double-right" style="margin-left: 3px"></i>',
      }
    }
  }
});
