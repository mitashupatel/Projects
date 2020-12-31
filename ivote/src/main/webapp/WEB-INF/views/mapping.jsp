<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<!-- Mirrored from slidesigma.com/themes/html/costic/pages/form/form-validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 22 Mar 2020 07:35:48 GMT -->
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <title>Costic Dashboard</title>
  <!-- Iconic Fonts -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" href="/ivote/resources/vendors/iconic-fonts/flat-icons/flaticon.css">
  <link href="/ivote/resources/vendors/iconic-fonts/font-awesome/css/all.min.css" rel="stylesheet">
  <!-- Bootstrap core CSS -->
  <link href="/ivote/resources/assets/css/bootstrap.min.css" rel="stylesheet">
  <!-- jQuery UI -->
  <link href="/ivote/resources/assets/css/jquery-ui.min.css" rel="stylesheet">
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
    <!-- Body Content Wrapper -->
    <div class="ms-content-wrapper">
      <div class="row">
        <div class="col-md-12">
          <nav aria-label="breadcrumb">
            <ol class="breadcrumb pl-0">
              <li class="breadcrumb-item"><a href="#"><i class="material-icons">home</i> Home</a>
              </li>
              <li class="breadcrumb-item"><a href="#">Mapping</a>
              </li>
            </ol>
          </nav>
          <div class="ms-panel">
            <div class="ms-panel-header">
              <h6>Add Mappings</h6>
            </div>
            <div class="ms-panel-body">
              <form:form class="needs-validation" action="/ivote/admin/addMapping"
							modelAttribute="mapping" method="post">
				<form:hidden class="form-control" id="mappingId" name="mappingId" path="mappingId"/>
                <div class="form-row">
                <div class="col-md-4 mb-3">
                  <label for="exampleSelect">Election Name</label>
				  <form:select id="electionId" class="custom-select" path="electionId">
				  <form:option value="0">--- Select election ---</form:option>
                         <c:forEach items="${electionList}" var="election">
                           <form:option value="${election.electionId}">${election.electionName}</form:option>
                        </c:forEach>
                  </form:select>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom18">Party Name</label>
                    
                    <form:select class="custom-select" id="" path="partyId">
                    <form:option value="0">--- Select Party ---</form:option>
                         <c:forEach items="${partyList}" var="party">
                           <form:option value="${party.partyId}">${party.partyName}</form:option>
                        </c:forEach>
                  </form:select>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom18">MP Name</label>
                    
                    <form:select class="custom-select" id="" path="mpId">
                    <form:option value="0">--- Select MP ---</form:option>
                         <c:forEach items="${mpList}" var="mp">
                           <form:option value="${mp.mpId}">${mp.firstName} ${mp.lastName}</form:option>
                        </c:forEach>
                  </form:select>
                  </div>
                  
                  <div class="col-md-4 mb-3">
                  <label for="exampleSelect">Nation Name</label>
				 	
				  <form:select id="nationId" class="custom-select" path="nationId">
				  <form:option value="0">--- Select nation ---</form:option>
                         <c:forEach items="${nationList}" var="nation">
                           <form:option value="${nation.nationId}">${nation.nationName}</form:option>
                        </c:forEach>
                  </form:select>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom18">Regions Name</label>
                   
                    <form:select class="custom-select" id="regionsByNation" path="regionId">
                    <form:option value="0">--- Select region ---</form:option>
                         <c:forEach items="${regionList}" var="region">
                           <form:option value="${region.regionId}">${region.regionName}</form:option>
                        </c:forEach>
                  </form:select>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom18">Constituency Name</label>
                    <form:select class="custom-select" id="constituencyByRegion" path="constituencyId">
                    <form:option value="0">--- Select constituency ---</form:option>
                         <c:forEach items="${constituencyList}" var="constituency">
                           <form:option value="${constituency.constituencyId}">${constituency.constituencyName}</form:option>
                        </c:forEach>
                  </form:select>
                  </div>
                  
                  <div class="col-md-3 mb-3">
                    <label for="validationCustom18"></label>
                    <div class="input-group">
                      <input type="submit" class="btn btn-primary d-block w-100" name="btn100" value="Submit" 
                      style="padding-top: 9px;padding-bottom: 10px;margin-top: 5px;">
                      <div class="valid-feedback">
                        Looks good!
                      </div>
                    </div>
                  </div>
                  
                </div>
			 </form:form>
            </div>
            </div>
          </div>
      </div>
      <div class="ms-panel">
            <div class="ms-panel-header">
              <h6>Constituency List</h6>
            </div>
            <div class="ms-panel-body">
              <div class="table-responsive">
                <!-- <table id="data-table-4" class="table w-100 thead-primary"></table> -->
              <table id="data-table-final1" class="table w-100 thead-primary">
              	 <thead>
                      <tr>
                        <th scope="col">Mapping ID</th>
                        <th scope="col">Election Name</th>
                        <th scope="col">Party Name</th>
                        <th scope="col">Leader Name</th>
                        <th scope="col">MP Name</th>
                        <th scope="col">Nation Name</th>
                        <th scope="col">Region Name</th>
                        <th scope="col">Constituency Name</th>
                        <th scope="col">Send / Edit / Delete</th>
                      </tr>
                    </thead>
                    <tbody>
                     <c:forEach var="mapping" items="${mappingList}">
                     <tr>
                      	<td><c:out value="${mapping.mappingId}" /></td> 
                      	<td><c:out value="${mapping.electionName}" /></td>         
                      	<td><c:out value="${mapping.partyName}" /></td>
                      	<td><c:out value="${mapping.leaderFirstName} ${mapping.leaderLastName}" /></td>
                      	<td><c:out value="${mapping.mpFirstName} ${mapping.mpLastName}" /></td>
                      	<td><c:out value="${mapping.nationName}" /></td>
                      	<td><c:out value="${mapping.regionName}" /></td>
                      	<td><c:out value="${mapping.constituencyName}" /></td>
                      	<td><a href='/ivote/admin/editMapping/${mapping.mappingId}'><i class='fas fa-pencil-alt text-secondary'></i></a>
                          <a href='/ivote/admin/deleteMapping/${mapping.mappingId}'><i class='far fa-trash-alt ms-text-danger'></i></a></td>
                   	</tr>
                   	</c:forEach>
          		 </tbody>
                  </table>
              </table>
            </div></div>  
              </div>
            </div>
          </div>
    </div>
    
  </main>
 
  <!-- MODALS -->
      <!-- Quick bar -->
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
   <script src="/ivote/resources/assets/js/datatables.min.js">
  </script>
  <script src="/ivote/resources/assets/js/data-tables.js">
  </script>
  <!-- Global Required Scripts End -->
  <!-- Costic core JavaScript -->
  <script src="/ivote/resources/assets/js/framework.js"></script>
  <!-- Settings -->
  <script src="/ivote/resources/assets/js/settings.js"></script>
  <script type="text/javascript">
	  var tableOne = $('#data-table-final1').DataTable();
	   
  </script>
  <script type="text/javascript">
  	$("#nationId").change(function() {
  		var nationId = $(this).val();
  		//alert("nationid : "+nationId);
  	    $.ajax({
  	        type: 'GET',
  	        url: "/ivote/admin/getRegions/" + nationId,
  	        success: function(data){
  	            var slctSubcat=$('#regionsByNation'), option="";
  	            slctSubcat.empty();

  	            for(var i=0; i<data.length; i++){
  	                option = option + "<option value='"+data[i].regionId + "'>"+data[i].regionName + "</option>";
  	            }
  	            slctSubcat.append(option);
  	        },
  	        error:function(){
  	            alert("error");
  	        }
  	    });
  	    

 
	});
	  	$("#regionsByNation").change(function() {
  	  		var regId = $(this).val();
  	  		//alert("regId : "+regId);
  	  	    $.ajax({
  	  	        type: 'GET',
  	  	        url: "/ivote/admin/getPostCode/" + regId,
  	  	        success: function(data){
  	  	            var slctSubcat=$('#constituencyByRegion'), option="";
  	  	            slctSubcat.empty();
  	  	          var select = "<option value='0'> --- Select constituency ---</option>";
  	  	            for(var i=0; i<data.length; i++){
  	  	                option = option + "<option value='"+data[i].constituencyId + "'>"+data[i].constituencyName + "</option>";
  	  	            }
  	  	          slctSubcat.append(select);
  	  	            slctSubcat.append(option);
  	  	        },
  	  	        error:function(){
  	  	            alert("error");
  	  	        }
  	  	    });
  		});
  	  

  </script>
</body>


<!-- Mirrored from slidesigma.com/themes/html/costic/pages/form/form-validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 22 Mar 2020 07:35:48 GMT -->
</html>