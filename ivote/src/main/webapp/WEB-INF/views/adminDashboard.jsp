<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<!-- Mirrored from slidesigma.com/themes/html/costic/ by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 22 Mar 2020 07:22:05 GMT -->
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <title>Digital Menu Dashboard</title>
  <!-- Iconic Fonts -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link href="/ivote/resources/vendors/iconic-fonts/font-awesome/css/all.min.css" rel="stylesheet">
  <link rel="stylesheet" href="/ivote/resources/vendors/iconic-fonts/flat-icons/flaticon.css">
  <link rel="stylesheet" href="/ivote/resources/vendors/iconic-fonts/cryptocoins/cryptocoins.css">
  <link rel="stylesheet" href="/ivote/resources/vendors/iconic-fonts/cryptocoins/cryptocoins-colors.css">
  <!-- Bootstrap core CSS -->
  <link href="/ivote/resources/assets/css/bootstrap.min.css" rel="stylesheet">
  <!-- jQuery UI -->
  <link href="/ivote/resources/assets/css/jquery-ui.min.css" rel="stylesheet">
  <!-- Page Specific CSS (Slick Slider.css) -->
  <link href="/ivote/resources/assets/css/slick.css" rel="stylesheet">
  <link href="/ivote/resources/assets/css/datatables.min.css" rel="stylesheet">
  <!-- Costic styles -->
  <link href="/ivote/resources/assets/css/style.css" rel="stylesheet">
  <!-- Favicon -->
  <link rel="icon" type="image/png" sizes="32x32" href="/ivote/resources/favicon.ico">
</head>

<body class="ms-body ms-aside-left-open ms-primary-theme ms-has-quickbar">
  <!-- Preloader -->
  <div id="preloader-wrap">
    <div class="spinner spinner-8">
      <div class="ms-circle1 ms-child"></div>
      <div class="ms-circle2 ms-child"></div>
      <div class="ms-circle3 ms-child"></div>
      <div class="ms-circle4 ms-child"></div>
      <div class="ms-circle5 ms-child"></div>
      <div class="ms-circle6 ms-child"></div>
      <div class="ms-circle7 ms-child"></div>
      <div class="ms-circle8 ms-child"></div>
      <div class="ms-circle9 ms-child"></div>
      <div class="ms-circle10 ms-child"></div>
      <div class="ms-circle11 ms-child"></div>
      <div class="ms-circle12 ms-child"></div>
    </div>
  </div>
  <!-- Overlays -->
  <div class="ms-aside-overlay ms-overlay-left ms-toggler" data-target="#ms-side-nav" data-toggle="slideLeft"></div>
  <div class="ms-aside-overlay ms-overlay-right ms-toggler" data-target="#ms-recent-activity" data-toggle="slideRight"></div>
  <!-- Sidebar Navigation Left -->
  <%@ include file="adminLeftMenu.jsp" %>
  <!-- Main Content -->
  <main class="body-content">
    <!-- Navigation Bar -->
    	<%@ include file="adminHeader.jsp" %>
        <div class="ms-content-wrapper">
      <div class="row">
        <div class="col-md-12">
          <h1 class="db-header-title">Welcome, Anny</h1>
        </div>
        <div class="col-xl-3 col-lg-6 col-md-6">
          <div class="ms-card ms-widget has-graph-full-width ms-infographics-widget">
            <span class="ms-chart-label bg-black"><i class="material-icons">arrow_upward</i> 3.2%</span>
            <div class="ms-card-body media">
              <div class="media-body">
                <span class="black-text"><strong>Sells Graph</strong></span>
                <h2>$8,451</h2>
              </div>
            </div>
            <canvas id="line-chart"></canvas>
          </div>
        </div>
        <div class="col-xl-3 col-lg-6 col-md-6">
          <div class="ms-card ms-widget has-graph-full-width ms-infographics-widget">
            <span class="ms-chart-label bg-red"><i class="material-icons">arrow_downward</i> 4.5%</span>
            <div class="ms-card-body media">
              <div class="media-body">
                <span class="black-text"><strong>Total Visitors</strong></span>
                <h2>3,973</h2>
              </div>
            </div>
            <canvas id="line-chart-2"></canvas>
          </div>
        </div>
        <div class="col-xl-3 col-lg-6 col-md-6">
          <div class="ms-card ms-widget has-graph-full-width ms-infographics-widget">
            <span class="ms-chart-label bg-black"><i class="material-icons">arrow_upward</i> 12.5%</span>
            <div class="ms-card-body media">
              <div class="media-body">
                <span class="black-text"><strong>New Users</strong></span>
                <h2>7,333</h2>
              </div>
            </div>
            <canvas id="line-chart-3"></canvas>
          </div>
        </div>
        <div class="col-xl-3 col-lg-6 col-md-6">
          <div class="ms-card ms-widget has-graph-full-width ms-infographics-widget">
            <span class="ms-chart-label bg-red"><i class="material-icons">arrow_upward</i> 9.5%</span>
            <div class="ms-card-body media">
              <div class="media-body">
                <span class="black-text"><strong>Total Orders</strong></span>
                <h2>48,973</h2>
              </div>
            </div>
            <canvas id="line-chart-4"></canvas>
          </div>
        </div>
        <!-- Recent Orders Requested -->
        <div class="col-xl-6 col-md-12">
          <div class="ms-panel">
            <div class="ms-panel-header">
              <div class="d-flex justify-content-between">
                <div class="align-self-center align-left">
                  <h6>Recent Orders Requested</h6>
                </div>
                <button type="button" class="btn btn-primary">View All</button>
              </div>
            </div>
            <div class="ms-panel-body">
              <div class="table-responsive">
                <table class="table table-hover">
                  <thead>
                    <tr>
                      <th scope="col">Food Item</th>
                      <th scope="col">Price</th>
                      <th scope="col">Product ID</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td class="ms-table-f-w"> <img src="/ivote/resources/assets/img/costic/pizza.jpg" alt="people"> Pizza </td>
                      <td>$19.99</td>
                      <td>67384917</td>
                    </tr>
                    <tr>
                      <td class="ms-table-f-w"> <img src="/ivote/resources/assets/img/costic/french-fries.jpg" alt="people"> French Fries </td>
                      <td>$14.59</td>
                      <td>789393819</td>
                    </tr>
                    <tr>
                      <td class="ms-table-f-w"> <img src="/ivote/resources/assets/img/costic/cereals.jpg" alt="people"> Multigrain Hot Cereal </td>
                      <td>$25.22</td>
                      <td>137893137</td>
                    </tr>
                    <tr>
                      <td class="ms-table-f-w"> <img src="/ivote/resources/assets/img/costic/egg-sandwich.jpg" alt="people"> Fried Egg Sandwich </td>
                      <td>$11.23</td>
                      <td>235193138</td>
                    </tr>

                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <div class="col-xl-6 col-md-12">
          <div class="ms-panel ms-panel-fh">
            <div class="ms-panel-header new">
              <h6>Monthly Revenue</h6>
              <select class="form-control new" id="exampleSelect">
                <option value="1">January</option>
                <option value="2">February</option>
                <option value="3">March </option>
                <option value="4">April</option>
                <option value="5">May</option>
                <option value="1">June</option>
                <option value="2">July</option>
                <option value="3">August</option>
                <option value="4">September</option>
                <option value="5">October</option>
                <option value="4">November</option>
                <option value="5">December</option>
              </select>
            </div>
            <div class="ms-panel-body">
              <span class="progress-label"> <strong>Week 1</strong> </span>
              <div class="progress">
                <div class="progress-bar bg-primary" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">25%</div>
              </div>
              <span class="progress-label"> <strong>Week 2</strong> </span>
              <div class="progress">
                <div class="progress-bar bg-primary" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">50%</div>
              </div>
              <span class="progress-label"> <strong>Week 3</strong> </span>
              <div class="progress">
                <div class="progress-bar bg-primary" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">75%</div>
              </div>
              <span class="progress-label"> <strong>Week 4</strong> </span>
              <div class="progress">
                <div class="progress-bar bg-primary" role="progressbar" style="width: 40%" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100">40%</div>
              </div>
            </div>
          </div>
        </div>
        <!-- Food Orders -->
        <div class="col-md-12">
          <div class="ms-panel">
            <div class="ms-panel-header">
              <h6>Trending Orders</h6>
            </div>
            <div class="ms-panel-body">
              <div class="row">

                <div class="col-xl-3 col-lg-6 col-md-6 col-sm-6">
                  <div class="ms-card no-margin">
                    <div class="ms-card-img">
                      <img src="/ivote/resources/assets/img/costic/food-5.jpg" alt="card_img">
                    </div>
                    <div class="ms-card-body">
                      <div class="ms-card-heading-title">
                        <h6>Meat Stew</h6>
                        <span class="green-text"><strong>$25.00</strong></span>
                      </div>

                      <div class="ms-card-heading-title">
                        <p>Orders <span class="red-text">15</span></p>
                        <p>Income <span class="red-text">$175</span></p>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-xl-3 col-lg-6 col-md-6 col-sm-6">
                  <div class="ms-card no-margin">
                    <div class="ms-card-img">
                      <img src="/ivote/resources/assets/img/costic/food-2.jpg" alt="card_img">
                    </div>
                    <div class="ms-card-body">
                      <div class="ms-card-heading-title">
                        <h6>Pancake</h6>
                        <span class="green-text"><strong>$50.00</strong></span>
                      </div>

                      <div class="ms-card-heading-title">
                        <p>Orders <span class="red-text">75</span></p>
                        <p>Income <span class="red-text">$275</span></p>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-xl-3 col-lg-6 col-md-6 col-sm-6">
                  <div class="ms-card no-margin">
                    <div class="ms-card-img">
                      <img src="/ivote/resources/assets/img/costic/food-4.jpg" alt="card_img">
                    </div>
                    <div class="ms-card-body">
                      <div class="ms-card-heading-title">
                        <h6>Burger</h6>
                        <span class="green-text"><strong>$45.00</strong></span>
                      </div>

                      <div class="ms-card-heading-title">
                        <p>Orders <span class="red-text">85</span></p>
                        <p>Income <span class="red-text">$575</span></p>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-xl-3 col-lg-6 col-md-6 col-sm-6">
                  <div class="ms-card no-margin">
                    <div class="ms-card-img">
                      <img src="/ivote/resources/assets/img/costic/food-3.jpg" alt="card_img">
                    </div>
                    <div class="ms-card-body">
                      <div class="ms-card-heading-title">
                        <h6>Saled</h6>
                        <span class="green-text"><strong>$85.00</strong></span>
                      </div>
                      <div class="ms-card-heading-title">
                        <p>Orders <span class="red-text">175</span></p>
                        <p>Income <span class="red-text">$775</span></p>
                      </div>
                    </div>
                  </div>
                </div>

              </div>
            </div>
          </div>
        </div>
        <!-- END/Food Orders -->
        <!-- Recent Orders Requested -->
        <div class="col-xl-7 col-md-12">
          <div class="ms-panel ms-panel-fh">
            <div class="ms-panel-header">
              <div class="d-flex justify-content-between">
                <div class="ms-header-text">
                  <h6>Order Timing Chart</h6>
                </div>
              </div>

            </div>
            <div class="ms-panel-body pt-0">
              <div class="d-flex justify-content-between ms-graph-meta">
                <ul class="ms-list-flex mt-3 mb-5">
                  <li>
                    <span>Total Orders</span>
                    <h3 class="ms-count">703,49</h3>
                  </li>
                  <li>
                    <span>New Orders</span>
                    <h3 class="ms-count">95,038</h3>
                  </li>
                  <li>
                    <span>Repeat Orders</span>
                    <h3 class="ms-count">28,387</h3>
                  </li>
                  <li>
                    <span>Cancel Orders</span>
                    <h3 class="ms-count">260</h3>
                  </li>
                </ul>
              </div>
              <canvas id="youtube-subscribers"></canvas>
            </div>
          </div>
        </div>

        <!-- Favourite Products -->
        <div class="col-xl-5 col-md-12">
          <div class="ms-panel ms-widget ms-crypto-widget">
            <div class="ms-panel-header">
              <h6>Favourite charts</h6>
            </div>
            <div class="ms-panel-body p-0">
              <ul class="nav nav-tabs nav-justified has-gap px-4 pt-4" role="tablist">
                <li role="presentation" class="fs-12"><a href="#btc" aria-controls="btc" class="active show" role="tab" data-toggle="tab"> Mon </a></li>
                <li role="presentation" class="fs-12"><a href="#xrp" aria-controls="xrp" role="tab" data-toggle="tab"> Tue </a></li>
                <li role="presentation" class="fs-12"><a href="#ltc" aria-controls="ltc" role="tab" data-toggle="tab"> Wed </a></li>
                <li role="presentation" class="fs-12"><a href="#eth" aria-controls="eth" role="tab" data-toggle="tab"> Thu </a></li>
                <li role="presentation" class="fs-12"><a href="#zec" aria-controls="zec" role="tab" data-toggle="tab"> Fri </a></li>
              </ul>
              <div class="tab-content">
                <div role="tabpanel" class="tab-pane active show fade in" id="btc">
                  <div class="table-responsive">
                    <table class="table table-hover thead-light">
                      <thead>
                        <tr>
                          <th scope="col">Restaurant Names</th>
                          <th scope="col">Qty</th>
                          <th scope="col">Orders</th>
                          <th scope="col">Profit</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>Hunger House</td>
                          <td>8528</td>
                          <td class="ms-text-success">+17.24%</td>
                          <td>7.65%</td>
                        </tr>
                        <tr>
                          <td>Food Lounge</td>
                          <td>4867</td>
                          <td class="ms-text-danger">-12.24%</td>
                          <td>9.12%</td>
                        </tr>
                        <tr>
                          <td>Delizious</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                        <tr>
                          <td>Netherfood</td>
                          <td>1614</td>
                          <td class="ms-text-danger">-20.75%</td>
                          <td>12.25%</td>
                        </tr>
                        <tr>
                          <td>Rusmiz</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
                <div role="tabpanel" class="tab-pane fade" id="xrp">
                  <div class="table-responsive">
                    <table class="table table-hover thead-light">
                      <thead>
                        <tr>
                          <th scope="col">Restaurant Name</th>
                          <th scope="col">Qty</th>
                          <th scope="col">Orders</th>
                          <th scope="col">Profit</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>Hunger House</td>
                          <td>8528</td>
                          <td class="ms-text-success">+17.24%</td>
                          <td>7.65%</td>
                        </tr>
                        <tr>
                          <td>Food Lounge</td>
                          <td>4867</td>
                          <td class="ms-text-danger">-12.24%</td>
                          <td>9.12%</td>
                        </tr>
                        <tr>
                          <td>Delizious</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                        <tr>
                          <td>Netherfood</td>
                          <td>1614</td>
                          <td class="ms-text-danger">-20.75%</td>
                          <td>12.25%</td>
                        </tr>
                        <tr>
                          <td>Rusmiz</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
                <div role="tabpanel" class="tab-pane fade" id="ltc">
                  <div class="table-responsive">
                    <table class="table table-hover thead-light">
                      <thead>
                        <tr>
                          <th scope="col">Restaurant Name</th>
                          <th scope="col">Qty</th>
                          <th scope="col">Orders</th>
                          <th scope="col">Profit</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>Hunger House</td>
                          <td>8528</td>
                          <td class="ms-text-success">+17.24%</td>
                          <td>7.65%</td>
                        </tr>
                        <tr>
                          <td>Food Lounge</td>
                          <td>4867</td>
                          <td class="ms-text-danger">-12.24%</td>
                          <td>9.12%</td>
                        </tr>
                        <tr>
                          <td>Delizious</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                        <tr>
                          <td>Netherfood</td>
                          <td>1614</td>
                          <td class="ms-text-danger">-20.75%</td>
                          <td>12.25%</td>
                        </tr>
                        <tr>
                          <td>Rusmiz</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
                <div role="tabpanel" class="tab-pane fade" id="eth">
                  <div class="table-responsive">
                    <table class="table table-hover thead-light">
                      <thead>
                        <tr>
                          <th scope="col">Restaurant Name</th>
                          <th scope="col">Qty</th>
                          <th scope="col">Orders</th>
                          <th scope="col">Profit</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>Hunger House</td>
                          <td>8528</td>
                          <td class="ms-text-success">+17.24%</td>
                          <td>7.65%</td>
                        </tr>
                        <tr>
                          <td>Food Lounge</td>
                          <td>4867</td>
                          <td class="ms-text-danger">-12.24%</td>
                          <td>9.12%</td>
                        </tr>
                        <tr>
                          <td>Delizious</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                        <tr>
                          <td>Netherfood</td>
                          <td>1614</td>
                          <td class="ms-text-danger">-20.75%</td>
                          <td>12.25%</td>
                        </tr>
                        <tr>
                          <td>Rusmiz</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
                <div role="tabpanel" class="tab-pane fade" id="zec">
                  <div class="table-responsive">
                    <table class="table table-hover thead-light">
                      <thead>
                        <tr>
                          <th scope="col">Restaurant Name</th>
                          <th scope="col">Qty</th>
                          <th scope="col">Orders</th>
                          <th scope="col">Profit</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>Hunger House</td>
                          <td>8528</td>
                          <td class="ms-text-success">+17.24%</td>
                          <td>7.65%</td>
                        </tr>
                        <tr>
                          <td>Food Lounge</td>
                          <td>4867</td>
                          <td class="ms-text-danger">-12.24%</td>
                          <td>9.12%</td>
                        </tr>
                        <tr>
                          <td>Delizious</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                        <tr>
                          <td>Netherfood</td>
                          <td>1614</td>
                          <td class="ms-text-danger">-20.75%</td>
                          <td>12.25%</td>
                        </tr>
                        <tr>
                          <td>Rusmiz</td>
                          <td>7538</td>
                          <td class="ms-text-success">+32.04%</td>
                          <td>14.29%</td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>

            </div>
          </div>
          <!-- Favourite Products -->
          <!-- Total Earnings -->
          <div class="ms-panel">
            <div class="ms-panel-header">
              <h6>Total Earnings</h6>
            </div>
            <div class="ms-panel-body p-0">
              <div class="ms-quick-stats">
                <div class="ms-stats-grid">
                  <i class="fa fa-star"></i>
                  <p class="ms-text-dark">$8,033</p>
                  <span>Today</span>
                </div>
                <div class="ms-stats-grid">
                  <i class="fa fa-university"></i>
                  <p class="ms-text-dark">$3,039</p>
                  <span>Yesterday</span>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- Total Earnings -->
        <!-- Recent Placed Orders< -->
        <div class="col-12">
          <div class="ms-panel">
            <div class="ms-panel-header">
              <h6>Recently Placed Orders</h6>
            </div>
            <div class="ms-panel-body">
              <div class="table-responsive">
                <table class="table table-hover thead-primary">
                  <thead>
                    <tr>
                      <th scope="col">Order ID</th>
                      <th scope="col">Order Name</th>
                      <th scope="col">Customer Name</th>
                      <th scope="col">Location</th>
                      <th scope="col">Order Status</th>
                      <th scope="col">Delivered Time</th>
                      <th scope="col">Price</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <th scope="row">1</th>
                      <td>French Fries</td>
                      <td>Jhon Leo</td>
                      <td>New Town</td>
                      <td><span class="badge badge-primary">Pending</span>
                      </td>
                      <td>10:05</td>
                      <td>$10</td>
                    </tr>
                    <tr>
                      <th scope="row">2</th>
                      <td>Mango Pie</td>
                      <td>Kristien</td>
                      <td>Old Town</td>
                      <td><span class="badge badge-dark">Cancelled</span>
                      </td>
                      <td>14:05</td>
                      <td>$9</td>
                    </tr>
                    <tr>
                      <th scope="row">3</th>
                      <td>FrieD Egg Sandwich</td>
                      <td>Jack Suit</td>
                      <td>Oxford Street</td>
                      <td><span class="badge badge-success">Delivered</span>
                      </td>
                      <td>12:05</td>
                      <td>$19</td>
                    </tr>
                    <tr>
                      <th scope="row">4</th>
                      <td>Lemon Yogurt Parfait</td>
                      <td>Alesdro Guitto</td>
                      <td>Church hill</td>
                      <td><span class="badge badge-success">Delivered</span>
                      </td>
                      <td>12:05</td>
                      <td>$18</td>
                    </tr>
                    <tr>
                      <th scope="row">5</th>
                      <td>Spicy Grill Sandwich</td>
                      <td>Jacob Sahwny</td>
                      <td>palace Road</td>
                      <td><span class="badge badge-success">Delivered</span>
                      </td>
                      <td>12:05</td>
                      <td>$21</td>
                    </tr>
                    <tr>
                      <th scope="row">6</th>
                      <td>Chicken Sandwich</td>
                      <td>Peter Gill</td>
                      <td>Street 21</td>
                      <td><span class="badge badge-primary">Pending</span>
                      </td>
                      <td>12:05</td>
                      <td>$15</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <!-- Recent Orders< -->

        <div class="col-md-12">
          <div class="ms-panel">
            <div class="ms-panel-header">
              <h6>New Resturant Listings</h6>

            </div>
            <div class="ms-panel-body">
              <div class="row">
                <div class="col-lg-4 col-md-6 col-sm-6">
                  <div class="ms-card no-margin">
                    <div class="ms-card-body">
                      <div class="media fs-14">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/costic/customer-1.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <h6>Hunger House </h6>
                          <div class="dropdown float-right">
                            <a href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="material-icons">more_vert</i>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-right">
                              <li class="ms-dropdown-list">
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Sales</span>
                                  </div>
                                </a>
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Details</span>
                                  </div>
                                </a>
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Remove</span>
                                  </div>
                                </a>
                              </li>
                            </ul>
                          </div>
                          <p class="fs-12 my-1 text-disabled">30 seconds ago</p>
                        </div>

                      </div>
                      <ul class="ms-star-rating rating-fill rating-circle ratings-new">
                        <li class="ms-rating-item"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                      </ul>
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nunc velit, dictum eget nulla a, sollicitudin rhoncus orci. Vivamus nec commodo turpis.</p>
                    </div>
                    <div class="ms-card-img">
                      <img src="/ivote/resources/assets/img/costic/food-1.jpg" alt="card_img">
                    </div>
                    <div class="ms-card-footer text-disabled d-flex">
                      <div class="ms-card-options">
                        <i class="material-icons">favorite</i> 982
                      </div>
                      <div class="ms-card-options">
                        <i class="material-icons">comment</i> 785
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-6">
                  <div class="ms-card no-margin">
                    <div class="ms-card-body">
                      <div class="media fs-14">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/costic/customer-2.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <h6>Food Lounge</h6>
                          <div class="dropdown float-right">
                            <a href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="material-icons">more_vert</i>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-right">
                              <li class="ms-dropdown-list">
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Sales</span>
                                  </div>
                                </a>
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Details</span>
                                  </div>
                                </a>
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Remove</span>
                                  </div>
                                </a>
                              </li>
                            </ul>
                          </div>
                          <p class="fs-12 my-1 text-disabled">30 seconds ago</p>
                        </div>

                      </div>
                      <ul class="ms-star-rating rating-fill rating-circle ratings-new">
                        <li class="ms-rating-item"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                      </ul>
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nunc velit, dictum eget nulla a, sollicitudin rhoncus orci. Vivamus nec commodo turpis.</p>
                    </div>
                    <div class="ms-card-img">
                      <img src="/ivote/resources/assets/img/costic/food-2.jpg" alt="card_img">
                    </div>
                    <div class="ms-card-footer text-disabled d-flex">
                      <div class="ms-card-options">
                        <i class="material-icons">favorite</i> 982
                      </div>
                      <div class="ms-card-options">
                        <i class="material-icons">comment</i> 785
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-6">
                  <div class="ms-card no-margin">
                    <div class="ms-card-body">
                      <div class="media fs-14">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/costic/customer-6.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <h6>Delizious </h6>
                          <div class="dropdown float-right">
                            <a href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="material-icons">more_vert</i>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-right">
                              <li class="ms-dropdown-list">
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Sales</span>
                                  </div>
                                </a>
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Details</span>
                                  </div>
                                </a>
                                <a class="media p-2" href="#">
                                  <div class="media-body">
                                    <span>Remove</span>
                                  </div>
                                </a>
                              </li>
                            </ul>
                          </div>
                          <p class="fs-12 my-1 text-disabled">30 seconds ago</p>
                        </div>

                      </div>
                      <ul class="ms-star-rating rating-fill rating-circle ratings-new">
                        <li class="ms-rating-item"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                        <li class="ms-rating-item rated"> <i class="material-icons">star</i> </li>
                      </ul>
                      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nunc velit, dictum eget nulla a, sollicitudin rhoncus orci. Vivamus nec commodo turpis.</p>
                    </div>
                    <div class="ms-card-img">
                      <img src="/ivote/resources/assets/img/costic/food-3.jpg" alt="card_img">
                    </div>
                    <div class="ms-card-footer text-disabled d-flex">
                      <div class="ms-card-options">
                        <i class="material-icons">favorite</i> 982
                      </div>
                      <div class="ms-card-options">
                        <i class="material-icons">comment</i> 785
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

        <!-- Recent Support Tickets -->
        <div class="col-xl-6 col-md-12">
          <div class="ms-panel ms-panel-fh">
            <div class="ms-panel-header">
              <div class="d-flex justify-content-between">
                <div class="align-self-center align-left">
                  <h6>Recent Support Tickets</h6>
                </div>
                <a href="#" class="btn btn-primary"> View All</a>
              </div>
            </div>
            <div class="ms-panel-body p-0">
              <ul class="ms-list ms-feed ms-twitter-feed ms-recent-support-tickets">
                <li class="ms-list-item">
                  <a href="#" class="media clearfix">
                    <img src="/ivote/resources/assets/img/costic/customer-4.jpg" class="ms-img-round ms-img-small" alt="This is another feature">
                    <div class="media-body">
                      <div class="d-flex justify-content-between">
                        <h6 class="ms-feed-user mb-0">Lorem ipsum dolor</h6>
                        <span class="badge badge-success"> Open </span>
                      </div> <span class="my-2 d-block"> <i class="material-icons">date_range</i> February 24, 2019</span>
                      <p class="d-block">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla luctus lectus a facilisis bibendum. Duis quis convallis sapien ...</p>
                      <div class="d-flex justify-content-between align-items-end">
                        <div class="ms-feed-controls"> <span>
                            <i class="material-icons">chat</i> 16
                          </span>
                          <span>
                            <i class="material-icons">attachment</i> 3
                          </span>
                        </div>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="ms-list-item">
                  <a href="#" class="media clearfix">
                    <img src="/ivote/resources/assets/img/costic/customer-1.jpg" class="ms-img-round ms-img-small" alt="This is another feature">
                    <div class="media-body">
                      <div class="d-flex justify-content-between">
                        <h6 class="ms-feed-user mb-0">Lorem ipsum dolor</h6>
                        <span class="badge badge-success"> Open </span>
                      </div> <span class="my-2 d-block"> <i class="material-icons">date_range</i> February 24, 2019</span>
                      <p class="d-block">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla luctus lectus a facilisis bibendum. Duis quis convallis sapien ...</p>
                      <div class="d-flex justify-content-between align-items-end">
                        <div class="ms-feed-controls"> <span>
                            <i class="material-icons">chat</i> 11
                          </span>
                          <span>
                            <i class="material-icons">attachment</i> 1
                          </span>
                        </div>
                      </div>
                    </div>
                  </a>
                </li>
                <li class="ms-list-item">
                  <a href="#" class="media clearfix">
                    <img src="/ivote/resources/assets/img/costic/customer-7.jpg" class="ms-img-round ms-img-small" alt="This is another feature">
                    <div class="media-body">
                      <div class="d-flex justify-content-between">
                        <h6 class="ms-feed-user mb-0">Lorem ipsum dolor</h6>
                        <span class="badge badge-danger"> Closed </span>
                      </div> <span class="my-2 d-block"> <i class="material-icons">date_range</i> February 24, 2019</span>
                      <p class="d-block">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla luctus lectus a facilisis bibendum. Duis quis convallis sapien ...</p>
                      <div class="d-flex justify-content-between align-items-end">
                        <div class="ms-feed-controls"> <span>
                            <i class="material-icons">chat</i> 21
                          </span>
                          <span>
                            <i class="material-icons">attachment</i> 5
                          </span>
                        </div>
                      </div>
                    </div>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <!-- Recent Support Tickets -->
        <!-- client chat -->
        <div class="col-xl-6 col-md-12">
          <div class="ms-panel ms-panel-fh ms-widget ms-chat-conversations">
            <div class="ms-panel-header">
              <div class="ms-chat-header justify-content-between">
                <div class="ms-chat-user-container media clearfix">
                  <div class="ms-chat-status ms-status-online ms-chat-img mr-3 align-self-center">
                    <img src="/ivote/resources/assets/img/costic/customer-1.jpg" class="ms-img-round" alt="people">
                  </div>
                  <div class="media-body ms-chat-user-info mt-1">
                    <h6>Heather Brown</h6>
                    <span class="text-disabled fs-12">
                      Active Now
                    </span>
                  </div>
                </div>
                <ul class="ms-list ms-list-flex ms-chat-controls">
                  <li data-toggle="tooltip" data-placement="top" title="Call"> <i class="material-icons">local_phone</i>
                  </li>
                  <li data-toggle="tooltip" data-placement="top" title="Video Call"> <i class="material-icons">videocam</i>
                  </li>
                  <li data-toggle="tooltip" data-placement="top" title="Add to Chat"> <i class="material-icons">person_add</i>
                  </li>
                </ul>
              </div>
            </div>
            <div class="ms-panel-body ms-scrollable">
              <div class="ms-chat-bubble ms-chat-message ms-chat-outgoing media clearfix">
                <div class="ms-chat-status ms-status-online ms-chat-img">
                  <img src="/ivote/resources/assets/img/costic/customer-1.jpg" class="ms-img-round" alt="people">
                </div>
                <div class="media-body">
                  <div class="ms-chat-text">
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
                  </div>
                  <p class="ms-chat-time">10:33 pm</p>
                </div>
              </div>
              <div class="ms-chat-bubble ms-chat-message ms-chat-incoming media clearfix">
                <div class="ms-chat-status ms-status-online ms-chat-img">
                  <img src="/ivote/resources/assets/img/costic/customer-2.jpg" class="ms-img-round" alt="people">
                </div>
                <div class="media-body">
                  <div class="ms-chat-text">
                    <p>I'm doing great, thanks for asking</p>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard</p>
                  </div>
                  <p class="ms-chat-time">11:01 pm</p>
                </div>
              </div>
              <div class="ms-chat-bubble ms-chat-message ms-chat-outgoing media clearfix">
                <div class="ms-chat-status ms-status-online ms-chat-img">
                  <img src="/ivote/resources/assets/img/costic/customer-1.jpg" class="ms-img-round" alt="people">
                </div>
                <div class="media-body">
                  <div class="ms-chat-text">
                    <p>It is a long established fact that a reader will be distracted by the readable content of a page</p>
                    <p>There are many variations of passages of Lorem Ipsum available</p>
                  </div>
                  <p class="ms-chat-time">11:03 pm</p>
                </div>
              </div>
              <div class="ms-panel-footer">
                <div class="ms-chat-textbox">
                  <ul class="ms-list-flex mb-0">
                    <li class="ms-chat-vn"><i class="material-icons">mic</i>
                    </li>
                    <li class="ms-chat-input">
                      <input type="text" name="msg" placeholder="Enter Message" value="">
                    </li>
                    <li class="ms-chat-text-controls ms-list-flex"> <span> <i class="material-icons">tag_faces</i> </span>
                      <span> <i class="material-icons">attach_file</i> </span>
                      <span> <i class="material-icons">camera_alt</i> </span>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      <!-- client chat -->
      </div>
    </div>
  </main>
  <!-- MODALS -->
  <!-- Quick bar -->
  <aside id="ms-quick-bar" class="ms-quick-bar fixed ms-d-block-lg">

    <ul class="nav nav-tabs ms-quick-bar-list" role="tablist">

      <li class="ms-quick-bar-item ms-has-qa" role="presentation" data-toggle="tooltip" data-placement="left" title="Launch To-do-list" data-title="To-do-list">
        <a href="#qa-toDo" aria-controls="qa-toDo" role="tab" data-toggle="tab">
          <i class="flaticon-list"></i>

        </a>
      </li>
      <li class="ms-quick-bar-item ms-has-qa" role="presentation" data-toggle="tooltip" data-placement="left" title="Launch Reminders" data-title="Reminders">
        <a href="#qa-reminder" aria-controls="qa-reminder" role="tab" data-toggle="tab">
          <i class="flaticon-bell"></i>

        </a>
      </li>
      <li class="ms-quick-bar-item ms-has-qa" role="presentation" data-toggle="tooltip" data-placement="left" title="Launch Notes" data-title="Notes">
        <a href="#qa-notes" aria-controls="qa-notes" role="tab" data-toggle="tab">
          <i class="flaticon-pencil"></i>

        </a>
      </li>
      <li class="ms-quick-bar-item ms-has-qa" role="presentation" data-toggle="tooltip" data-placement="left" title="Invite Members" data-title="Invite Members">
        <a href="#qa-invite" aria-controls="qa-invite" role="tab" data-toggle="tab">
          <i class="flaticon-share-1"></i>

        </a>
      </li>
      <li class="ms-quick-bar-item ms-has-qa" role="presentation" data-toggle="tooltip" data-placement="left" title="Settings" data-title="Settings">
        <a href="#qa-settings" aria-controls="qa-settings" role="tab" data-toggle="tab">
          <i class="flaticon-gear"></i>

        </a>
      </li>
    </ul>
    <div class="ms-configure-qa" data-toggle="tooltip" data-placement="left" title="Configure Quick Access">

      <a href="#">
        <i class="flaticon-hammer"></i>

      </a>

    </div>

    <!-- Quick bar Content -->
    <div class="ms-quick-bar-content">

      <div class="ms-quick-bar-header clearfix">
        <h5 class="ms-quick-bar-title float-left">Title</h5>
        <button type="button" class="close ms-toggler" data-target="#ms-quick-bar" data-toggle="hideQuickBar" aria-label="Close"><span aria-hidden="true">&times;</span></button>
      </div>

      <div class="ms-quick-bar-body tab-content">



        <div role="tabpanel" class="tab-pane" id="qa-toDo">
          <div class="ms-quickbar-container ms-todo-list-container ms-scrollable">

            <form class="ms-add-task-block">
              <div class="form-group mx-3 mt-0  fs-14 clearfix">
                <input type="text" class="form-control fs-14 float-left" id="task-block" name="todo-block" placeholder="Add Task Block" value="">
                <button type="submit" class="ms-btn-icon bg-primary float-right"><i class="material-icons text-disabled">add</i></button>
              </div>
            </form>

            <ul class="ms-todo-list">
              <li class="ms-card ms-qa-card ms-deletable">

                <div class="ms-card-header clearfix">
                  <h6 class="ms-card-title">Task Block Title</h6>
                  <button data-toggle="tooltip" data-placement="left" title="Add a Task to this block" class="ms-add-task-to-block ms-btn-icon float-right"> <i class="material-icons text-disabled">add</i> </button>
                </div>

                <div class="ms-card-body">
                  <ul class="ms-list ms-task-block">
                    <li class="ms-list-item ms-to-do-task ms-deletable">
                      <label class="ms-checkbox-wrap ms-todo-complete">
                        <input type="checkbox" value="">
                        <i class="ms-checkbox-check"></i>
                      </label>
                      <span> Task to do </span>
                      <button type="submit" class="close"><i class="flaticon-trash ms-delete-trigger"> </i></button>
                    </li>
                    <li class="ms-list-item ms-to-do-task ms-deletable">
                      <label class="ms-checkbox-wrap ms-todo-complete">
                        <input type="checkbox" value="">
                        <i class="ms-checkbox-check"></i>
                      </label>
                      <span>Task to do</span>
                      <button type="submit" class="close"><i class="flaticon-trash ms-delete-trigger"> </i></button>
                    </li>
                  </ul>
                </div>

                <div class="ms-card-footer clearfix">
                  <a href="#" class="text-disabled mr-2"> <i class="flaticon-archive"> </i> Archive </a>
                  <a href="#" class="text-disabled  ms-delete-trigger float-right"> <i class="flaticon-trash"> </i> Delete </a>
                </div>

              </li>
            </ul>

          </div>
        </div>

        <div role="tabpanel" class="tab-pane" id="qa-reminder">
          <div class="ms-quickbar-container ms-reminders">

            <ul class="ms-qa-options">
              <li> <a href="#" data-toggle="modal" data-target="#reminder-modal"> <i class="flaticon-bell"></i> New Reminder </a> </li>
            </ul>

            <div class="ms-quickbar-container ms-scrollable">

              <div class="ms-card ms-qa-card ms-deletable">
                <div class="ms-card-body">
                  <p> Developer Meeting in Block B </p>
                  <span class="text-disabled fs-12"><i class="material-icons fs-14">access_time</i> Today - 3:45 pm</span>
                </div>
                <div class="ms-card-footer clearfix">

                  <div class="ms-note-editor float-right">
                    <a href="#" class="text-disabled mr-2" data-toggle="modal" data-target="#reminder-modal"> <i class="flaticon-pencil"> </i> Edit </a>
                    <a href="#" class="text-disabled  ms-delete-trigger"> <i class="flaticon-trash"> </i> Delete </a>
                  </div>

                </div>
              </div>
              <div class="ms-card ms-qa-card ms-deletable">
                <div class="ms-card-body">
                  <p> Start adding change log to version 2 </p>
                  <span class="text-disabled fs-12"><i class="material-icons fs-14">access_time</i> Tomorrow - 12:00 pm</span>
                </div>
                <div class="ms-card-footer clearfix">

                  <div class="ms-note-editor float-right">
                    <a href="#" class="text-disabled mr-2" data-toggle="modal" data-target="#reminder-modal"> <i class="flaticon-pencil"> </i> Edit </a>
                    <a href="#" class="text-disabled  ms-delete-trigger"> <i class="flaticon-trash"> </i> Delete </a>
                  </div>

                </div>
              </div>

            </div>

          </div>
        </div>

        <div role="tabpanel" class="tab-pane" id="qa-notes">

          <ul class="ms-qa-options">
            <li> <a href="#" data-toggle="modal" data-target="#notes-modal"> <i class="flaticon-sticky-note"></i> New Note </a> </li>
            <li> <a href="#"> <i class="flaticon-excel"></i> Export to Excel </a> </li>
          </ul>

          <div class="ms-quickbar-container ms-scrollable">

            <div class="ms-card ms-qa-card ms-deletable">
              <div class="ms-card-header">
                <h6 class="ms-card-title">Don't forget to check with the designer</h6>
              </div>
              <div class="ms-card-body">
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vulputate urna in faucibus venenatis. Etiam at dapibus neque,
                  vel varius metus. Pellentesque eget orci malesuada, venenatis magna et
                </p>
                <ul class="ms-note-members clearfix mb-0">
                  <li class="ms-deletable"> <img src="/ivote/resources/assets/img/people/people-3.jpg" alt="member"> </li>
                  <li class="ms-deletable"> <img src="/ivote/resources/assets/img/people/people-5.jpg" alt="member"> </li>
                </ul>
              </div>
              <div class="ms-card-footer clearfix">

                <div class="dropdown float-left">
                  <a href="#" class="text-disabled" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="flaticon-share-1"></i> Share
                  </a>
                  <ul class="dropdown-menu">
                    <li class="dropdown-menu-header">
                      <h6 class="dropdown-header ms-inline m-0"><span class="text-disabled">Share With</span></h6>
                    </li>
                    <li class="dropdown-divider"></li>
                    <li class="ms-scrollable ms-dropdown-list ms-members-list">
                      <a class="media p-2" href="#">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/people/people-10.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <span>John Doe</span>
                        </div>
                      </a>
                      <a class="media p-2" href="#">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/people/people-9.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <span>Raymart Sandiago</span>
                        </div>
                      </a>
                      <a class="media p-2" href="#">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/people/people-7.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <span>Heather Brown</span>
                        </div>
                      </a>
                    </li>
                  </ul>
                </div>
                <div class="ms-note-editor float-right">
                  <a href="#" class="text-disabled mr-2" data-toggle="modal" data-target="#notes-modal"> <i class="flaticon-pencil"> </i> Edit </a>
                  <a href="#" class="text-disabled  ms-delete-trigger"> <i class="flaticon-trash"> </i> Delete </a>
                </div>

              </div>
            </div>

            <div class="ms-card ms-qa-card ms-deletable">
              <div class="ms-card-header">
                <h6 class="ms-card-title">Perform the required unit tests</h6>
              </div>
              <div class="ms-card-body">
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vulputate urna in faucibus venenatis. Etiam at dapibus neque,
                  vel varius metus. Pellentesque eget orci malesuada, venenatis magna et
                </p>
                <ul class="ms-note-members clearfix mb-0">
                  <li class="ms-deletable"> <img src="/ivote/resources/assets/img/people/people-9.jpg" alt="member"> </li>
                </ul>
              </div>
              <div class="ms-card-footer clearfix">

                <div class="dropdown float-left">
                  <a href="#" class="text-disabled" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="flaticon-share-1"></i> Share
                  </a>
                  <ul class="dropdown-menu">
                    <li class="dropdown-menu-header">
                      <h6 class="dropdown-header ms-inline m-0"><span class="text-disabled">Share With</span></h6>
                    </li>
                    <li class="dropdown-divider"></li>
                    <li class="ms-scrollable ms-dropdown-list ms-members-list">
                      <a class="media p-2" href="#">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/people/people-10.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <span>John Doe</span>
                        </div>
                      </a>
                      <a class="media p-2" href="#">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/people/people-9.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <span>Raymart Sandiago</span>
                        </div>
                      </a>
                      <a class="media p-2" href="#">
                        <div class="mr-2 align-self-center">
                          <img src="/ivote/resources/assets/img/people/people-7.jpg" class="ms-img-round" alt="people">
                        </div>
                        <div class="media-body">
                          <span>Heather Brown</span>
                        </div>
                      </a>
                    </li>
                  </ul>
                </div>
                <div class="ms-note-editor float-right">
                  <a href="#" class="text-disabled mr-2" data-toggle="modal" data-target="#notes-modal"> <i class="flaticon-pencil"> </i> Edit </a>
                  <a href="#" class="text-disabled  ms-delete-trigger"> <i class="flaticon-trash"> </i> Delete </a>
                </div>

              </div>
            </div>

          </div>

        </div>

        <div role="tabpanel" class="tab-pane" id="qa-invite">

          <div class="ms-quickbar-container text-center ms-invite-member">
            <i class="flaticon-network"></i>
            <p>Invite Team Members</p>
            <form>
              <div class="ms-form-group">
                <input type="text" placeholder="Member Email" class="form-control" name="invite-email" value="">
              </div>
              <div class="ms-form-group">
                <button type="submit" name="invite-member" class="btn btn-primary w-100">Invite</button>
              </div>
            </form>
          </div>

        </div>

        <div role="tabpanel" class="tab-pane" id="qa-settings">

          <div class="ms-quickbar-container text-center ms-invite-member">
            <div class="row">
              <div class="col-md-12 text-left mb-5">
                <h4 class="section-title bold">Customize</h4>
                <div>
                  <label class="ms-switch">
                    <input type="checkbox" id="dark-mode">
                    <span class="ms-switch-slider round"></span>
                  </label>
                  <span> Dark Mode </span>
                </div>
                <div>
                  <label class="ms-switch">
                    <input type="checkbox" id="remove-quickbar">
                    <span class="ms-switch-slider round"></span>
                  </label>
                  <span> Remove Quickbar </span>
                </div>
              </div>
              <div class="col-md-12 text-left">
                <h4 class="section-title bold">Keyboard Shortcuts</h4>
                <p class="ms-directions mb-0"><code>Esc</code> Close Quick Bar</p>
                <p class="ms-directions mb-0"><code>Alt + (1 -&gt; 6)</code> Open Quick Bar Tab</p>
                <p class="ms-directions mb-0"><code>Alt + Q</code> Enable Quick Bar Configure Mode</p>

              </div>
            </div>
          </div>

        </div>

      </div>

    </div>
  </aside>
  <!-- Reminder Modal -->
  <div class="modal fade" id="reminder-modal" tabindex="-1" role="dialog" aria-labelledby="reminder-modal">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header bg-secondary">
          <h5 class="modal-title has-icon text-white"> New Reminder</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
          </button>
        </div>
        <form>
          <div class="modal-body">
            <div class="ms-form-group">
              <label>Remind me about</label>
              <textarea class="form-control" name="reminder"></textarea>
            </div>
            <div class="ms-form-group"> <span class="ms-option-name fs-14">Repeat Daily</span>
              <label class="ms-switch float-right">
                <input type="checkbox"> <span class="ms-switch-slider round"></span>
              </label>
            </div>
            <div class="row">
              <div class="col-md-6">
                <div class="ms-form-group">
                  <input type="text" class="form-control datepicker" name="reminder-date" value="" />
                </div>
              </div>
              <div class="col-md-6">
                <div class="ms-form-group">
                  <select class="form-control" name="reminder-time">
                    <option value="">12:00 pm</option>
                    <option value="">1:00 pm</option>
                    <option value="">2:00 pm</option>
                    <option value="">3:00 pm</option>
                    <option value="">4:00 pm</option>
                  </select>
                </div>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-light" data-dismiss="modal">Close</button>
            <button type="button" class="btn btn-secondary shadow-none" data-dismiss="modal">Add Reminder</button>
          </div>
        </form>
      </div>
    </div>
  </div>
  <!-- Notes Modal -->
  <div class="modal fade" id="notes-modal" tabindex="-1" role="dialog" aria-labelledby="notes-modal">
    <div class="modal-dialog modal-dialog-centered" role="document">
      <div class="modal-content">
        <div class="modal-header bg-secondary">
          <h5 class="modal-title has-icon text-white" id="NoteModal">New Note</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
          </button>
        </div>
        <form>
          <div class="modal-body">
            <div class="ms-form-group">
              <label>Note Title</label>
              <input type="text" class="form-control" name="note-title" value="">
            </div>
            <div class="ms-form-group">
              <label>Note Description</label>
              <textarea class="form-control" name="note-description"></textarea>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-light" data-dismiss="modal">Close</button>
            <button type="button" class="btn btn-secondary shadow-none" data-dismiss="modal">Add Note</button>
          </div>
        </form>
      </div>
    </div>
  </div>
  <!-- SCRIPTS -->
  <!-- Global Required Scripts Start -->
  <script src="/ivote/resources/assets/js/jquery-3.3.1.min.js"></script>
  <script src="/ivote/resources/assets/js/popper.min.js"></script>
  <script src="/ivote/resources/assets/js/bootstrap.min.js"></script>
  <script src="/ivote/resources/assets/js/perfect-scrollbar.js">
  </script>
  <script src="/ivote/resources/assets/js/jquery-ui.min.js">
  </script>
  <!-- Global Required Scripts End -->
  <!-- Page Specific Scripts Start -->

  <script src="/ivote/resources/assets/js/Chart.bundle.min.js">
  </script>
  <script src="/ivote/resources/assets/js/widgets.js"> </script>
  <script src="/ivote/resources/assets/js/clients.js"> </script>
  <script src="/ivote/resources/assets/js/Chart.Financial.js"> </script>
  <script src="/ivote/resources/assets/js/d3.v3.min.js">
  </script>
  <script src="/ivote/resources/assets/js/topojson.v1.min.js">
  </script>
  <script src="/ivote/resources/assets/js/datatables.min.js">
  </script>
  <script src="/ivote/resources/assets/js/data-tables.js">
  </script>
  <!-- Page Specific Scripts Finish -->
  <!-- Costic core JavaScript -->
  <script src="/ivote/resources/assets/js/framework.js"></script>
  <!-- Settings -->
  <script src="/ivote/resources/assets/js/settings.js"></script>
</body>


<!-- Mirrored from slidesigma.com/themes/html/costic/ by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 22 Mar 2020 07:25:33 GMT -->
</html>
