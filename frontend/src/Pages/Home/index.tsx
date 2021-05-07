import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div>
                <div className="container">
                    <div className="jumbotron">
                        <h1 className="display-4">DS-Sales</h1>
                        <p className="lead">See all perspectives from the sales of your company</p>
                        <hr />
                        <p>This application was developed with React and retrieve data from a backend using Java and Spring.</p>
                        <Link className="btn btn-primary btn-large  " to="dashboard">
                            Access Dashboard
                        </Link>
                    </div>
                </div>
            </div>
            <Footer />
        </>
    )
}

export default Home;
