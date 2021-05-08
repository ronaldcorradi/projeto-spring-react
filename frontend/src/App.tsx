import DataTable from 'components/DataTable/index'
import Footer from 'components/Footer/index'
import NavBar from 'components/NavBar/index'

function App() {
  return (
    <>
    <NavBar/>
    <div className="container">
      <h1 className="text-primary">Hello World</h1>
    </div>
    <div>
      <DataTable/>
    </div>
    <Footer/>
    </>
  );
}

export default App;
