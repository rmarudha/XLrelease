// Exported from:        http://e5-PC:5516/#/templates/Folder6389d2fd8b5348379f31a3d11849e3dc-Releaseaa38f1174f8c48d4b8649e69582105df/releasefile
// XL Release version:   8.5.4
// Date created:         Fri Mar 22 12:03:02 IST 2019

xlr {
  template('XLR_task') {
    folder('Raja_test_release')
    description 'new task'
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-03-22T09:00:00+0530')
    phases {
      phase('New Phase') {
        tasks {
          manual('Creatingfile') {
            
          }
        }
      }
    }
    
  }
}