<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<aside id="ms-side-nav" class="side-nav fixed ms-aside-scrollable ms-aside-left">
    <!-- Logo -->
    <div class="logo-sn ms-d-block-lg">
      <a class="pl-0 ml-0 text-center" href="index-2.html">
        <img src="/ivote/resources/assets/img/costic/costic-logo-216x62.png" alt="logo">
      </a>
    </div>
    <!-- Navigation -->
    <ul class="accordion ms-main-aside fs-14" id="side-nav-accordion">
      <!-- Dashboard -->
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#dashboard" aria-expanded="false" aria-controls="dashboard"> <span><i class="material-icons fs-16">dashboard</i>Dashboard </span>
        </a>
        <ul id="dashboard" class="collapse" aria-labelledby="dashboard" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/index">ivote</a>
          </li>
        </ul>
      </li>
      <!-- /Dashboard -->
      <!-- Master -->
      <!-- admins-->
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#admin" aria-expanded="false" aria-controls="customer"> <span><i class="fas fa-user-friends fs-16"></i>Admins </span>
        </a>
        <ul id="admin" class="collapse" aria-labelledby="admin" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/addAdminPage">Add Admin</a>
          </li>
          <li> <a href="/ivote/admin/adminList">Admin List</a>
          </li>
        </ul>
      </li>
      <!-- admins-->
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#voter" aria-expanded="false" aria-controls="voter"> <span><i class="fas fa-user-friends fs-16"></i>Voters </span>
        </a>
        <ul id="voter" class="collapse" aria-labelledby="customer" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/addVoterPage">Add Voter</a>
          </li>
          <li> <a href="/ivote/admin/voterList">Voter List</a>
          </li>
        </ul>
      </li>
      <!-- Voters  end -->
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#leader" aria-expanded="false" aria-controls="leader"> <span><i class="fas fa-user-friends fs-16"></i>Leaders </span>
        </a>
        <ul id="leader" class="collapse" aria-labelledby="customer" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/addLeaderPage">Add Leader</a>
          </li>
          <li> <a href="/ivote/admin/leaderList">Leader List</a>
          </li>
        </ul>
      </li>
	  <!-- Leader end -->
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#mp" aria-expanded="false" aria-controls="mp"> <span><i class="fas fa-user-friends fs-16"></i>MPs </span>
        </a>
        <ul id="mp" class="collapse" aria-labelledby="customer" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/addMPPage">Add MP</a>
          </li>
          <li> <a href="/ivote/admin/mpList">MP List</a>
          </li>
        </ul>
      </li>
	  <!-- mp end -->
	  <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#election" aria-expanded="false" aria-controls="election"> <span><i class="fas fa-user-friends fs-16"></i>Elections </span>
        </a>
        <ul id="election" class="collapse" aria-labelledby="customer" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/addElectionPage">Add Election</a>
          </li>
          <li> <a href="/ivote/admin/electionList">Election List</a>
          </li>
        </ul>
      </li>
	  <!-- Election end -->
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#party" aria-expanded="false" aria-controls="party"> <span><i class="fas fa-user-friends fs-16"></i>Party </span>
        </a>
        <ul id="party" class="collapse" aria-labelledby="customer" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/addPartyPage">Add Party</a>
          </li>
          <li> <a href="/ivote/admin/partyList">Party List</a>
          </li>
        </ul>
      </li>
	  
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#master" aria-expanded="false" aria-controls="master"> <span><i class="fa fa-archive fs-16"></i>Masters </span>
        </a>
        <ul id="master" class="collapse" aria-labelledby="product" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/nations">Nations</a>
          </li>
          <li> <a href="/ivote/admin/regions">Regions</a>
          </li>
          <li> <a href="/ivote/admin/constituencies">Constituencies</a>
          </li>
          <li> <a href="/ivote/admin/postCode">Postcode</a>
          </li>
         
        </ul>
      </li>
      <!-- election -->
      <li class="menu-item">
        <a href="/ivote/admin/election"> <span><i class="fa fa-tasks fs-16"></i>Election</span>
        </a>
      </li>
      <!-- /election -->
      <!-- party -->
      <li class="menu-item">
        <a href="/ivote/admin/mapping"> <span><i class="fa fa-tasks fs-16"></i>Mapping</span>
        </a>
      </li>
       <li class="menu-item">
        <a href="/ivote/user/voteResult"> <span><i class="fa fa-tasks fs-16"></i>Result</span>
        </a>
      </li>
      <!-- /election -->
	<!-- orders -->
      <li class="menu-item">
        <a href="#" class="has-chevron" data-toggle="collapse" data-target="#order" aria-expanded="false" aria-controls="product"> <span><i class="fa fa-clipboard-list fs-16"></i>Orders </span>
        </a>
        <ul id="order" class="collapse" aria-labelledby="product" data-parent="#side-nav-accordion">
          <li> <a href="/ivote/admin/orderItemList">Order Items</a>
          </li>
          <li> <a href="/ivote/admin/orderList">Order List</a>
          </li>
        </ul>
      </li>
      <!-- /orders -->
      <!-- Payment -->
      <li class="menu-item">
        <a href="/ivote/admin/paymentList"> <span><i class="fa fa-tasks fs-16"></i>Payment</span>
        </a>
      </li>
      <!-- /table -->
    </ul>
  </aside>
  <!-- Sidebar Right -->
  <aside id="ms-recent-activity" class="side-nav fixed ms-aside-right ms-scrollable">
    <div class="ms-aside-header">
      <ul class="nav nav-tabs tabs-bordered d-flex nav-justified mb-3" role="tablist">
        <li role="presentation" class="fs-12"><a href="#activityLog" aria-controls="activityLog" class="active" role="tab" data-toggle="tab"> Activity Log</a>
        </li>
        <li>
          <button type="button" class="close ms-toggler text-center" data-target="#ms-recent-activity" data-toggle="slideRight"><span aria-hidden="true">&times;</span>
          </button>
        </li>
      </ul>
    </div>
    <div class="ms-aside-body">
      <div class="tab-content">
        <div role="tabpanel" class="tab-pane active fade show" id="activityLog">
          <ul class="ms-activity-log">
            <li>
              <div class="ms-btn-icon btn-pill icon btn-light"> <i class="flaticon-gear"></i>
              </div>
              <h6>Update 1.0.0 Pushed</h6>
              <span> <i class="material-icons">event</i>1 January, 2019</span>
              <p class="fs-14">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque scelerisque diam non nisi semper, ula in sodales vehicula....</p>
            </li>
            <li>
              <div class="ms-btn-icon btn-pill icon btn-success"> <i class="flaticon-tick-inside-circle"></i>
              </div>
              <h6>Profile Updated</h6>
              <span> <i class="material-icons">event</i>4 March, 2018</span>
              <p class="fs-14">Curabitur purus sem, malesuada eu luctus eget, suscipit sed turpis. Nam pellentesque felis vitae justo accumsan, sed semper nisi sollicitudin...</p>
            </li>
            <li>
              <div class="ms-btn-icon btn-pill icon btn-warning"> <i class="flaticon-alert-1"></i>
              </div>
              <h6>Your payment is due</h6>
              <span> <i class="material-icons">event</i>1 January, 2019</span>
              <p class="fs-14">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque scelerisque diam non nisi semper, ula in sodales vehicula....</p>
            </li>
            <li>
              <div class="ms-btn-icon btn-pill icon btn-danger"> <i class="flaticon-alert"></i>
              </div>
              <h6>Database Error</h6>
              <span> <i class="material-icons">event</i>4 March, 2018</span>
              <p class="fs-14">Curabitur purus sem, malesuada eu luctus eget, suscipit sed turpis. Nam pellentesque felis vitae justo accumsan, sed semper nisi sollicitudin...</p>
            </li>
            <li>
              <div class="ms-btn-icon btn-pill icon btn-info"> <i class="flaticon-information"></i>
              </div>
              <h6>Checkout what's Trending</h6>
              <span> <i class="material-icons">event</i>1 January, 2019</span>
              <p class="fs-14">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque scelerisque diam non nisi semper, ula in sodales vehicula....</p>
            </li>
            <li>
              <div class="ms-btn-icon btn-pill icon btn-secondary"> <i class="flaticon-diamond"></i>
              </div>
              <h6>Your Dashboard is ready</h6>
              <span> <i class="material-icons">event</i>4 March, 2018</span>
              <p class="fs-14">Curabitur purus sem, malesuada eu luctus eget, suscipit sed turpis. Nam pellentesque felis vitae justo accumsan, sed semper nisi sollicitudin...</p>
            </li>
          </ul> <a href="#" class="btn btn-primary d-block"> View All </a>
        </div>
      </div>
    </div>
  </aside>
</body>
</html>