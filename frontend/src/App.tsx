import DonutChart from "./components/DonutChart/index";
import BarChart from "./components/BarChart/index";
import DataTable from "./components/DataTable/index";
import Footer from "./components/Footer/index";
import NavBar from "./components/NavBar/index";

function App() {
  return (
    <>
      <NavBar/>
      <div className="container">
        <h1 className="text-primary py-3">Sales Dashboard</h1>

        <div className='row px-3'>
          <div className='col-sm-6'>
            <h5 className='text-center text-secondary'>% Success</h5>
            <BarChart/>
          </div>
          <div className='col-sm-6'>
            <h5 className='text-center text-secondary'>All Sales</h5>
            <DonutChart/>
          </div>
        </div>

        <div className='py-3'>
          <h2 className='text-primary'>All Sales</h2>
        </div>
        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
